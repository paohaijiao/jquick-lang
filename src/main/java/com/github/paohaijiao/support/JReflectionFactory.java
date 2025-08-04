package com.github.paohaijiao.support;
import com.github.paohaijiao.support.impl.JConstructorFactory;
import com.github.paohaijiao.support.impl.JInstanceMethodFactory;
import com.github.paohaijiao.support.impl.JStaticMethodFactory;


public class JReflectionFactory {


    private JReflectionFactory() {

    }

    public static JStaticMethodFactory staticMethod(Class<?> clazz) {
        return new JStaticMethodFactory(clazz);
    }



    public static JInstanceMethodFactory instanceMethod(Object target) {
        return new JInstanceMethodFactory(target);
    }



    public static <T> JConstructorFactory<T> constructor(Class<T> clazz) {
        return new JConstructorFactory<>(clazz);
    }









}
