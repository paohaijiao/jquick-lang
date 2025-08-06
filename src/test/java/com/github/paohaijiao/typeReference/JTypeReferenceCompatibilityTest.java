package com.github.paohaijiao.typeReference;

import com.github.paohaijiao.support.JTypeReference;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
public class JTypeReferenceCompatibilityTest {
    @Test
    public void testPrimitiveCompatibility() {
        JTypeReference<Integer> intRef = JTypeReference.of(int.class);
        assertTrue(intRef.isAssignableFrom(JTypeReference.of(Integer.class)));  // int ← Integer
        assertTrue(JTypeReference.of(Integer.class).isAssignableFrom(intRef));  // Integer ← int
        assertFalse(intRef.isAssignableFrom(JTypeReference.of(Long.class)));    // int ← long
        JTypeReference<Boolean> boolRef = JTypeReference.of(boolean.class);
        assertTrue(boolRef.isAssignableFrom(JTypeReference.of(Boolean.class))); // boolean ← Boolean
    }
    @Test
    public void testCollectionCompatibility() {
        JTypeReference<List<Number>> numListRef = JTypeReference.listOf(Number.class);
        JTypeReference<List<Integer>> intListRef = JTypeReference.listOf(Integer.class);
        assertTrue(numListRef.isAssignableFrom(intListRef));  // List<Number> ← List<Integer>
        assertTrue(intListRef.isAssignableFrom(numListRef)); // List<Integer> ← List<Number>
        JTypeReference<Set<CharSequence>> seqSetRef = JTypeReference.setOf(CharSequence.class);
        JTypeReference<Set<String>> strSetRef = JTypeReference.setOf(String.class);
        assertTrue(seqSetRef.isAssignableFrom(strSetRef));    // Set<CharSequence> ← Set<String>
    }
    @Test
    public void testArrayCompatibility() {
        JTypeReference<Number[]> numArrayRef = JTypeReference.arrayOf(Number.class);
        JTypeReference<Integer[]> intArrayRef = JTypeReference.arrayOf(Integer.class);
        assertTrue(numArrayRef.isAssignableFrom(intArrayRef));  // Number[] ← Integer[]
        assertFalse(intArrayRef.isAssignableFrom(numArrayRef));  // Integer[] ← Number[]
        JTypeReference<Integer[][]> int2dArrayRef = JTypeReference.arrayOf(Integer[].class);
        JTypeReference<Number[][]> num2dArrayRef = JTypeReference.arrayOf(Number[].class);
        assertTrue(num2dArrayRef.isAssignableFrom(int2dArrayRef)); // Number[][] ← Integer[][]
    }

    @Test
    public void testMapCompatibility() {
        JTypeReference<Map<CharSequence, Number>> mapRef =
                JTypeReference.mapOf(CharSequence.class, Number.class);
        JTypeReference<Map<String, Integer>> concreteMapRef =
                JTypeReference.mapOf(String.class, Integer.class);
        assertTrue(mapRef.isAssignableFrom(concreteMapRef));  // Map<CharSequence, Number> ← Map<String, Integer>
    }
    @Test
    public void testNullCompatibility() {
        JTypeReference<String> strRef = JTypeReference.of(String.class);
        assertTrue(strRef.isAssignableFrom(JTypeReference.of(Void.class)));  // String ← null
        JTypeReference<Integer> intRef = JTypeReference.of(int.class);
        assertFalse(intRef.isAssignableFrom(JTypeReference.of(Void.class))); // int ← null
    }

    @Test
    public void testEdgeCases() {
        JTypeReference<int[]> primitiveArrayRef = JTypeReference.of(int[].class);
        JTypeReference<Integer[]> wrapperArrayRef = JTypeReference.arrayOf(Integer.class);
        assertFalse(primitiveArrayRef.isAssignableFrom(wrapperArrayRef)); // int[] ≠ Integer[]
        JTypeReference<List<? extends Number>> wildcardRef =
                new JTypeReference<List<? extends Number>>() {};
        JTypeReference<List<Integer>> concreteRef = JTypeReference.listOf(Integer.class);
       // assertTrue(wildcardRef.isAssignableFrom(concreteRef)); // List<? extends Number> ← List<Integer>
    }
}
