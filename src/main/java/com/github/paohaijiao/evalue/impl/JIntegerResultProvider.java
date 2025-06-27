package com.github.paohaijiao.evalue.impl;

import com.github.paohaijiao.anno.JHandlesClass;
import com.github.paohaijiao.evalue.JResultProvider;

@JHandlesClass(Integer.class)
public class JIntegerResultProvider implements JResultProvider<Integer> {
    @Override
    public boolean supports(Class<?> clazz) {
        return Integer.class.isAssignableFrom(clazz);
    }

    @Override
    public Object getResult(Integer input) {
        return input * 2;
    }
}
