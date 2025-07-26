package com.github.paohaijiao.function;

import com.github.paohaijiao.model.JSchool;
import com.github.paohaijiao.model.JStudent;
import com.github.paohaijiao.support.JObjectFactory;
import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.*;

import static com.github.paohaijiao.support.JObjectFactory.*;

public class JObjectFactoryTest {
    @Test
    public void testCreateByConstructorNoArgs() throws Exception {
        Object result = JObjectFactory.createByConstructor(
                "com.github.paohaijiao.model.JStudent",
                new ArrayList<>());
        System.out.println(result);
    }

    @Test
    public void testCreateByConstructorWithArgs() throws Exception {
        List<Object> args = Arrays.asList("testName", 123);
        Object result = JObjectFactory.createByConstructor(
                "com.github.paohaijiao.model.JStudent", args);
        JStudent testObj = (JStudent) result;
        System.out.println(testObj);
    }

    @Test
    public void testCreateByStaticMethod() throws Exception {
        List<Object> args = Arrays.asList("staticName", 456);
        Object result = JObjectFactory.createByStaticMethod(
                "com.github.paohaijiao.model.JStudent",
                "create",
                args);
        JStudent testObj = (JStudent) result;
        System.out.println(testObj);
    }

    @Test
    public  void testCreateByInstanceMethod() throws Exception {
        JStudent existingObj = new JStudent("original", 789);
        List<Object> args =new ArrayList<>();// List.of("prefix-");
        args.add("prefix-");
        Object result = JObjectFactory.createByInstanceMethod(
                existingObj,
                "copyWithPrefix",
                args);
        System.out.println(result);
    }

    @Test
    public void testCreateAutoDetectConstructor() throws Exception {
        List<Object> args = Arrays.asList("autoName", 100);
        Object result = JObjectFactory.create(
                "com.github.paohaijiao.model.JStudent",
                null,
                args,
                null,
                null);
        System.out.println(result);
    }

    @Test
    public void testCreateAutoDetectStaticMethod() throws Exception {
        List<Object> args = Arrays.asList("staticAuto", 200);
        Object result = JObjectFactory.create(
                "com.github.paohaijiao.model.JStudent",
                "create",
                args,
                true,
                null);
        System.out.println(result);

    }

    @Test
    public void testCreateAutoDetectInstanceMethod() throws Exception {
        JStudent existingObj = new JStudent("existing", 300);
        List<Object> args = new ArrayList<>();//"instancePrefix-"
        args.add("prefix-");
        Object result = JObjectFactory.create(
                null,
                "copyWithPrefix",
                args,
                false,
                existingObj);
        System.out.println(result);
    }

    @Test
    public void testCreateWithPrimitiveTypes() throws Exception {
        List<Object> args = Arrays.asList(123, 456.789f, true);
        Object result = JObjectFactory.createByConstructor(
                "com.github.paohaijiao.model.JStudent",
                args);
        System.out.println(result);

    }
    @Test
    public void collections() throws Exception {
        List<String> stringList = Arrays.asList("a", "b", "c");
        Set<Integer> intSet = new HashSet<>(Arrays.asList(1, 2, 3));
        Map<Long, String> idToNameMap = new HashMap<>();
        idToNameMap.put(1L, "Alice");
        idToNameMap.put(2L, "Bob");
        Class<?> listType = getCollectionType(stringList, 0);
        Class<?> setType = getCollectionType(intSet, 1);
        Class<?> mapType = getMapType(idToNameMap, 2);
        System.out.println("List type: " + listType.getName());  // java.util.Arrays$ArrayList
        System.out.println("Set type: " + setType.getName());    // java.util.HashSet
        System.out.println("Map type: " + mapType.getName());    // java.util.HashMap
    }
    @Test
    public void param()  {
        Type parameterizedListType = createParameterizedCollectionType(
                ArrayList.class,
                String.class
        );
        Type parameterizedMapType = createParameterizedMapType(
                HashMap.class,
                Long.class,
                String.class
        );

        Method method = null;
        try {
            method = JSchool.class.getMethod("processStringList", List.class, Map.class);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        Type[] genericParameterTypes = method.getGenericParameterTypes();

        System.out.println(parameterizedListType.equals(genericParameterTypes[0]));
        System.out.println(parameterizedMapType.equals(genericParameterTypes[1]));
    }
}
