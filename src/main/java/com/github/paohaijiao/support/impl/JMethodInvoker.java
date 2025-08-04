package com.github.paohaijiao.support.impl;

import com.github.paohaijiao.support.JTypeReference;

import java.lang.reflect.Array;
import java.lang.reflect.Executable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class JMethodInvoker {

    @SuppressWarnings("unchecked")
    static <R> R invoke(Object target, Class<?> clazz, String methodName,
                        JTypeReference<?>[] argTypes, Object... args) {
        Objects.requireNonNull(methodName, "Method name cannot be null");
        try {
            Class<?>[] parameterTypes = convertToClassArray(argTypes);
            Method method = findMethod(clazz, methodName, parameterTypes);
            method.setAccessible(true);
            if (method.isVarArgs()) {
                args = handleVarArgs(method, args);
            }
            return (R) method.invoke(target, args);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Access denied when invoking method: " + methodName, e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException("Method invocation failed: " + methodName, e.getTargetException());
        }
    }
    private static Method findMethod(Class<?> clazz, String methodName, Class<?>[] parameterTypes) {
        List<Method> methods = Arrays.stream(clazz.getDeclaredMethods())
                .filter(m -> m.getName().equals(methodName))
                .collect(Collectors.toList());
        for (Method method : methods) {
            if (isMatch(method.getParameterTypes(), parameterTypes, method.isVarArgs())) {
                return method;
            }
        }
        Class<?> superClass = clazz.getSuperclass();
        if (superClass != null) {
            try {
                return findMethod(superClass, methodName, parameterTypes);
            } catch (IllegalArgumentException e) {
            }
        }
        for (Class<?> interfaceClass : clazz.getInterfaces()) {
            try {
                return findMethod(interfaceClass, methodName, parameterTypes);
            } catch (IllegalArgumentException e) {
            }
        }
        throw new IllegalArgumentException("No matching method found: " + methodName +
                " in class " + clazz.getName() +
                " with parameter types: " + Arrays.toString(parameterTypes));
    }

    public static Object[] handleVarArgs(Executable executable, Object[] args) {
        Class<?>[] parameterTypes = executable.getParameterTypes();
        int varArgsPosition = parameterTypes.length - 1;
        if (args.length == parameterTypes.length &&
                args[varArgsPosition] != null &&
                parameterTypes[varArgsPosition].isAssignableFrom(args[varArgsPosition].getClass())) {
            return args;
        }
        Object[] newArgs = new Object[parameterTypes.length];
        System.arraycopy(args, 0, newArgs, 0, varArgsPosition);
        int varArgsLength = args.length - varArgsPosition;
        Object varArgsArray = Array.newInstance(
                parameterTypes[varArgsPosition].getComponentType(),
                varArgsLength
        );
        for (int i = 0; i < varArgsLength; i++) {
            Array.set(varArgsArray, i, args[varArgsPosition + i]);
        }
        newArgs[varArgsPosition] = varArgsArray;
        return newArgs;
    }

    public static boolean isMatch(Class<?>[] expectedTypes, Class<?>[] actualTypes, boolean isVarArgs) {
        if (expectedTypes.length == 0 && actualTypes.length == 0) return true;
        if (!isVarArgs) {
            if (expectedTypes.length != actualTypes.length) return false;
            for (int i = 0; i < expectedTypes.length; i++) {
                if (!isAssignable(expectedTypes[i], actualTypes[i])) return false;
            }
            return true;
        } else {
            if (actualTypes.length < expectedTypes.length - 1) return false;
            for (int i = 0; i < expectedTypes.length - 1; i++) {
                if (!isAssignable(expectedTypes[i], actualTypes[i])) return false;
            }
            Class<?> varArgsType = expectedTypes[expectedTypes.length - 1].getComponentType();
            for (int i = expectedTypes.length - 1; i < actualTypes.length; i++) {
                if (!isAssignable(varArgsType, actualTypes[i])) return false;
            }
            return true;
        }
    }
    public static Class<?>[] convertToClassArray(JTypeReference<?>[] argTypes) {
        return argTypes == null ? new Class<?>[0] :
                Arrays.stream(argTypes)
                        .map(JTypeReference::getRawType)
                        .toArray(Class<?>[]::new);
    }
    private static boolean isAssignable(Class<?> target, Class<?> source) {
        if (target.isAssignableFrom(source)) return true;
        if (target.isPrimitive()) return getWrapperClass(target).isAssignableFrom(source);
        if (source.isPrimitive()) return target.isAssignableFrom(getWrapperClass(source));
        return false;
    }
    private static Class<?> getWrapperClass(Class<?> primitiveType) {
        if (primitiveType == int.class) return Integer.class;
        if (primitiveType == long.class) return Long.class;
        if (primitiveType == double.class) return Double.class;
        if (primitiveType == float.class) return Float.class;
        if (primitiveType == boolean.class) return Boolean.class;
        if (primitiveType == char.class) return Character.class;
        if (primitiveType == byte.class) return Byte.class;
        if (primitiveType == short.class) return Short.class;
        if (primitiveType == void.class) return Void.class;
        return primitiveType;
    }

}
