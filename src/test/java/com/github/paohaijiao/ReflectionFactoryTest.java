package com.github.paohaijiao;

import com.github.paohaijiao.support.JTypeReference;
import com.github.paohaijiao.support.ReflectionFactory;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ReflectionFactoryTest {
    public static class TestClass {
        private final String name;
        private final int value;
        public TestClass() {
            this("default", 0);
        }

        public TestClass(String name) {
            this(name, 0);
        }

        public TestClass(String name, Integer value) {
            this.name = name;
            this.value = value;
        }

        public TestClass(String... names) {
            this(names != null && names.length > 0 ? names[0] : "default", names != null ? names.length : 0);
        }
        public static String staticConcat(String a, String b) {
            return a + b;
        }

        public static String staticVarargs(String prefix, String... values) {
            return prefix + String.join(",", values);
        }
        public String getName() {
            return name;
        }

        public int getValue() {
            return value;
        }

        public String concat(String suffix) {
            return name + suffix;
        }
        public String varargsMethod(String prefix, String... values) {
            return prefix + name + String.join(",", values);
        }
    }
    @Test
    public void testConstructorFactory() {
        TestClass instance1 = ReflectionFactory.constructor(TestClass.class).newInstance();
        assertEquals("default", instance1.getName());
        assertEquals(0, instance1.getValue());
        TestClass instance2 = ReflectionFactory.constructor(TestClass.class)
                .newInstance(JTypeReference.of(String.class), "test");
        assertEquals("test", instance2.getName());
        assertEquals(1, instance2.getValue());

        TestClass instance3 = ReflectionFactory.constructor(TestClass.class)
                .newInstance(new JTypeReference<?>[]{JTypeReference.of(String.class), JTypeReference.of(int.class)},
                        "test", 42);
        assertEquals("test", instance3.getName());
        assertEquals(42, instance3.getValue());
        JTypeReference<?>[] references=new JTypeReference<?>[]{
                JTypeReference.of(String.class),JTypeReference.of(String.class),JTypeReference.of(String.class),
                JTypeReference.of(String.class)};
        TestClass instance4 = ReflectionFactory.constructor(TestClass.class)
                .newInstance(references, "a", "b", "c");
        assertEquals("a", instance4.getName());
        assertEquals(3, instance4.getValue());
    }
    @Test
    public void testStaticMethodFactory() {
        String result1 = ReflectionFactory.staticMethod(TestClass.class)
                .invoke("staticConcat",
                        new JTypeReference<?>[]{JTypeReference.of(String.class), JTypeReference.of(String.class)},
                        "Hello", "World");
        assertEquals("HelloWorld", result1);
        String result2 = ReflectionFactory.staticMethod(TestClass.class)
                .invoke("staticVarargs",
                        new JTypeReference<?>[]{JTypeReference.of(String.class), JTypeReference.varargsOf(String.class)},
                        "Prefix:", "a", "b", "c");
        assertEquals("Prefix:a,b,c", result2);
        JTypeReference<?>[] references=new JTypeReference<?>[]{
                JTypeReference.of(String.class),JTypeReference.of(String.class)};
        String result3 = ReflectionFactory.staticMethod(TestClass.class)
                .invoke("staticConcat",references, "A", "B");
        assertEquals("AB", result3);
    }

    @Test
    public void testInstanceMethodFactory() {
        TestClass instance = new TestClass("test");
        String name = ReflectionFactory.instanceMethod(instance).invoke("getName");
        assertEquals("test", name);
        String concatResult = ReflectionFactory.instanceMethod(instance)
                .invoke("concat", JTypeReference.of(String.class), "_suffix");
        assertEquals("test_suffix", concatResult);
        String varargsResult = ReflectionFactory.instanceMethod(instance)
                .invoke("varargsMethod",
                        new JTypeReference<?>[]{JTypeReference.of(String.class), JTypeReference.varargsOf(String.class)},
                        "Prefix:", "x", "y", "z");
        assertEquals("Prefix:testx,y,z", varargsResult);
        String[] params = new String[]{"1", "2", "3"};
        String arrayVarargsResult = ReflectionFactory.instanceMethod(instance)
                .invoke("varargsMethod",
                        new JTypeReference<?>[]{JTypeReference.of(String.class), JTypeReference.varargsOf(String.class)},
                        "Prefix:", params);
        assertEquals("Prefix:test1,2,3", arrayVarargsResult);
    }

    @Test
    public void testComplexTypes() {
        List<String> list = ReflectionFactory.constructor(ArrayList.class).newInstance();
        ReflectionFactory.instanceMethod(list).invoke("add", JTypeReference.of(String.class), "item1");
        ReflectionFactory.instanceMethod(list).invoke("add", JTypeReference.of(String.class), "item2");
        int size = ReflectionFactory.instanceMethod(list).invoke("size");
        assertEquals(2, size);
        String[] array = (String[]) ReflectionFactory.staticMethod(Arrays.class)
                .invoke("copyOf",
                        new JTypeReference<?>[]{JTypeReference.of(Object[].class), JTypeReference.of(int.class)},
                        new String[]{"a", "b", "c"}, 2);
        assertArrayEquals(new String[]{"a", "b"}, array);
    }
}
