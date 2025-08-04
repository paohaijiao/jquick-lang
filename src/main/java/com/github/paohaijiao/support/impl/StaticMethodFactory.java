package com.github.paohaijiao.support.impl;

import com.github.paohaijiao.support.JTypeReference;
import com.github.paohaijiao.support.ReflectionFactory;

import java.util.Objects;

public class StaticMethodFactory {
    private final Class<?> clazz;

    public StaticMethodFactory(Class<?> clazz) {
        this.clazz = Objects.requireNonNull(clazz, "Class cannot be null");
    }

    public <R> R invoke(String methodName, JTypeReference<?>[] argTypes, Object... args) {
        return MethodInvoker.invoke(null, clazz, methodName, argTypes, args);
    }

    public <R> R invoke(String methodName) {
        return invoke(methodName, new JTypeReference<?>[0]);
    }

    public <R> R invoke(String methodName, JTypeReference<?> argType, Object arg) {
        return invoke(methodName, new JTypeReference<?>[]{argType}, arg);
    }
}
