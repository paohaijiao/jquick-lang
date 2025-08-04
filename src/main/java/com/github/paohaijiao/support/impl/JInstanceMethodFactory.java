package com.github.paohaijiao.support.impl;

import com.github.paohaijiao.support.JTypeReference;

import java.util.Objects;

public class JInstanceMethodFactory {
    private final Object target;
    public JInstanceMethodFactory(Object target) {
        this.target = Objects.requireNonNull(target, "Target object cannot be null");
    }

    public <R> R invoke(String methodName, JTypeReference<?>[] argTypes, Object... args) {
        return JMethodInvoker.invoke(target, target.getClass(), methodName, argTypes, args);
    }

    public <R> R invoke(String methodName) {
        return invoke(methodName, new JTypeReference<?>[0]);
    }

    public <R> R invoke(String methodName, JTypeReference<?> argType, Object arg) {
        return invoke(methodName, new JTypeReference<?>[]{argType}, arg);
    }
}
