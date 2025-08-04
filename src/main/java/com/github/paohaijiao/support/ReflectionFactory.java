package com.github.paohaijiao.support;
import com.github.paohaijiao.support.impl.ConstructorFactory;
import com.github.paohaijiao.support.impl.InstanceMethodFactory;
import com.github.paohaijiao.support.impl.StaticMethodFactory;


public class ReflectionFactory {


    private ReflectionFactory() {

    }

    public static StaticMethodFactory staticMethod(Class<?> clazz) {
        return new StaticMethodFactory(clazz);
    }



    public static InstanceMethodFactory instanceMethod(Object target) {
        return new InstanceMethodFactory(target);
    }



    public static <T> ConstructorFactory<T> constructor(Class<T> clazz) {
        return new ConstructorFactory<>(clazz);
    }









}
