package com.github.paohaijiao.support.impl;

import com.github.paohaijiao.support.JTypeReference;

import java.util.Objects;

public class ConstructorFactory <T>{
    private final Class<T> clazz;

    public ConstructorFactory(Class<T> clazz) {
        this.clazz = Objects.requireNonNull(clazz, "Class cannot be null");
    }

    public T newInstance(JTypeReference<?>[] argTypes, Object... args) {
        return ConstructorInvoker.invoke(clazz, argTypes, args);
    }

    public T newInstance() {
        return newInstance(new JTypeReference<?>[0]);
    }

    public T newInstance(JTypeReference<?> argType, Object arg) {
        return newInstance(new JTypeReference<?>[]{argType}, arg);
    }
}
