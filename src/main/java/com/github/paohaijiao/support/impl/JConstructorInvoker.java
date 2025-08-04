package com.github.paohaijiao.support.impl;

import com.github.paohaijiao.support.JTypeReference;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import static com.github.paohaijiao.support.impl.JMethodInvoker.*;

public class JConstructorInvoker {
    public static <T> T invoke(Class<T> clazz, JTypeReference<?>[] argTypes, Object... args) {
        try {
            Class<?>[] parameterTypes = convertToClassArray(argTypes);
            Constructor<T> constructor = findConstructor(clazz, parameterTypes);
            constructor.setAccessible(true);
            if (constructor.isVarArgs()) {
                args = handleVarArgs(constructor, args);
            }
            return constructor.newInstance(args);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException("Failed to invoke constructor for class: " + clazz.getName(), e);
        }
    }
    @SuppressWarnings("unchecked")
    private static <T> Constructor<T> findConstructor(Class<T> clazz, Class<?>[] parameterTypes) {
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();

        for (Constructor<?> constructor : constructors) {
            if (isMatch(constructor.getParameterTypes(), parameterTypes, constructor.isVarArgs())) {
                return (Constructor<T>) constructor;
            }
        }
        throw new IllegalArgumentException("No matching constructor found for class: " + clazz.getName() + " with parameter types: " + Arrays.toString(parameterTypes));
    }

}
