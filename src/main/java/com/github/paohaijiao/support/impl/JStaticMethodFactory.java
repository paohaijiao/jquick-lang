package com.github.paohaijiao.support.impl;

import com.github.paohaijiao.support.JTypeReference;

import java.util.Objects;

public class JStaticMethodFactory {
    private final Class<?> clazz;

    public JStaticMethodFactory(Class<?> clazz) {
        this.clazz = Objects.requireNonNull(clazz, "Class cannot be null");
    }

    public <R> R invoke(String methodName, JTypeReference<?>[] argTypes, Object... args) {
        return JMethodInvoker.invoke(null, clazz, methodName, argTypes, args);
    }

    public <R> R invoke(String methodName) {
        return invoke(methodName, new JTypeReference<?>[0]);
    }

    public <R> R invoke(String methodName, JTypeReference<?> argType, Object arg) {
        return invoke(methodName, new JTypeReference<?>[]{argType}, arg);
    }
}
