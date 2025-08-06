package com.github.paohaijiao.typeReference;

import com.github.paohaijiao.factory.JTypeReferenceFactory;
import com.github.paohaijiao.support.JTypeReference;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class JTypeReferenceTest {
    @Test
    public void reference() throws IOException {
        JTypeReference<String> stringType = new JTypeReference<String>() {};
        JTypeReference<Integer> integerType = JTypeReference.of(Integer.class);
        JTypeReference<JTypeReference<String>> stringListType = new JTypeReference<JTypeReference<String>>() {};
        JTypeReference<List<Integer>> integerListType = JTypeReference.listOf(Integer.class);
        JTypeReference<Set<Long>> longSetType = JTypeReference.setOf(Long.class);
        JTypeReference<Map<String, Integer>> mapType = new JTypeReference<Map<String, Integer>>() {};
        JTypeReference<Map<Long, Double>> mapType2 = JTypeReference.mapOf(Long.class, Double.class);
        JTypeReference<String[]> stringArrayType = JTypeReference.varargsOf(String.class);
        JTypeReference<Runnable> runnableType = JTypeReference.interfaceOf(Runnable.class);
        JTypeReference<Map<String, List<Set<Integer>>>> complexType = new JTypeReference<Map<String, List<Set<Integer>>>>() {};

        JTypeReference type=JTypeReference.of(String.class);
        System.out.println(type);
    }
    @Test
    public void factory() throws IOException {
        JTypeReference<?> stringRef = JTypeReferenceFactory.fromClassName("java.lang.String");
        JTypeReference<?> listRef = JTypeReferenceFactory.listFromElementType("java.lang.Integer");
        JTypeReference<?> mapRef = JTypeReferenceFactory.mapFromTypes("java.lang.String", "java.lang.Object");
        JTypeReference<?> arrayRef = JTypeReferenceFactory.arrayFromElementType("java.lang.Integer");
        JTypeReference<?> complexRef = JTypeReferenceFactory.fromTypeString("java.util.Map<java.lang.String, java.util.List<java.lang.Integer>>");
        System.out.println(complexRef);
    }
    @Test
    public void testPrimitiveTypes() {
        JTypeReference<Integer> intRef = JTypeReference.of(int.class);
        assertTrue(intRef.targetAssignableFrom(10));       // int -> int
        assertFalse(intRef.targetAssignableFrom(10L));    // long -> int
        assertTrue(intRef.targetAssignableFrom(Integer.valueOf(10)));  // Integer -> int
        //assertFalse(intRef.isAssignableFrom(null));    // null -> int
        JTypeReference<Boolean> boolRef = JTypeReference.of(boolean.class);
        assertTrue(boolRef.targetAssignableFrom(true));    // boolean -> boolean
        assertTrue(boolRef.targetAssignableFrom(Boolean.TRUE)); // Boolean -> boolean
        assertFalse(boolRef.targetAssignableFrom(1));      // int -> boolean
    }

    @Test
    public void testWrapperTypes() {
        JTypeReference<Integer> integerRef = JTypeReference.of(Integer.class);
        assertTrue(integerRef.targetAssignableFrom(10));       // int -> Integer
        assertTrue(integerRef.targetAssignableFrom(Integer.valueOf(10))); // Integer -> Integer
        assertFalse(integerRef.targetAssignableFrom(10L));     // long -> Integer
        assertTrue(integerRef.targetAssignableFrom(null));     // null -> Integer
        JTypeReference<Double> doubleRef = JTypeReference.of(Double.class);
        assertTrue(doubleRef.targetAssignableFrom(3.14));      // double -> Double
        assertFalse(doubleRef.targetAssignableFrom(3.14f));    // float -> Double
    }

    @Test
    public void testArrays() {
        JTypeReference<String[]> stringArrayRef = JTypeReference.arrayOf(String.class);
        String[] strArray = new String[]{"a", "b"};
        Object[] objArray = new Object[]{"a", "b"};
        Integer[] intArray = new Integer[]{1, 2};
        assertTrue(stringArrayRef.targetAssignableFrom(strArray));  // String[] -> String[]
        assertFalse(stringArrayRef.targetAssignableFrom(objArray)); // Object[] -> String[]
        assertFalse(stringArrayRef.targetAssignableFrom(intArray)); // Integer[] -> String[]
        JTypeReference<int[]> intArrayRef = JTypeReference.of(int[].class);
        int[] intArr = new int[]{1, 2};
        Integer[] integerArr = new Integer[]{1, 2};
        assertTrue(intArrayRef.targetAssignableFrom(intArr));      // int[] -> int[]
        assertFalse(intArrayRef.targetAssignableFrom(integerArr)); // Integer[] -> int[]
    }

    @Test
    public void testCollections() {
        JTypeReference<List<String>> stringListRef = JTypeReference.listOf(String.class);
        List<String> stringList = new ArrayList<>();
        List<Integer> intList = new ArrayList<>();
        List<Object> objList = new ArrayList<>();
        assertTrue(stringListRef.targetAssignableFrom(stringList)); // List<String> -> List<String>
        assertTrue(stringListRef.targetAssignableFrom(intList));    // List<Integer> -> List<String>
        assertTrue(stringListRef.targetAssignableFrom(objList));    // List<Object> -> List<String>
        JTypeReference<Set<Double>> doubleSetRef = JTypeReference.setOf(Double.class);
        Set<Double> doubleSet = new HashSet<>();
        Set<Number> numberSet = new HashSet<>();
        assertTrue(doubleSetRef.targetAssignableFrom(doubleSet));   // Set<Double> -> Set<Double>
        assertTrue(doubleSetRef.targetAssignableFrom(numberSet));   // Set<Number> -> Set<Double>
    }

    @Test
    public void testMaps() {
        // Map<String, Integer>
        JTypeReference<Map<String, Integer>> mapRef = JTypeReference.mapOf(String.class, Integer.class);
        Map<String, Integer> stringIntMap = new HashMap<>();
        Map<Object, Number> objNumberMap = new HashMap<>();
        assertTrue(mapRef.targetAssignableFrom(stringIntMap));  // Map<String, Integer> -> Map<String, Integer>
        assertTrue(mapRef.targetAssignableFrom(objNumberMap));  // Map<Object, Number> -> Map<String, Integer>
    }

    @Test
    public void testNullHandling() {
        JTypeReference<String> stringRef = JTypeReference.of(String.class);
        assertTrue(stringRef.targetAssignableFrom(null));  // null -> String (允许)
        JTypeReference<Integer> intRef = JTypeReference.of(int.class);
        assertFalse(intRef.targetAssignableFrom(null));    // null -> int (不允许)
    }

    @Test
    public void testWildcardAndGenericTypes() {
        // List<?> 可以接受任何 List
        JTypeReference<List<?>> wildcardListRef = new JTypeReference<List<?>>() {};
        List<String> stringList = new ArrayList<>();
        List<Integer> intList = new ArrayList<>();
        assertTrue(wildcardListRef.targetAssignableFrom(stringList)); // List<String> -> List<?>
        assertTrue(wildcardListRef.targetAssignableFrom(intList));    // List<Integer> -> List<?>
        // List<? extends Number> 可以接受 List<Double>, List<Integer>
        JTypeReference<List<? extends Number>> numberListRef = new JTypeReference<List<? extends Number>>() {};
        List<Double> doubleList = new ArrayList<>();
        List<String> strList = new ArrayList<>();
        assertTrue(numberListRef.targetAssignableFrom(doubleList)); // List<Double> -> List<? extends Number>
    }
}
