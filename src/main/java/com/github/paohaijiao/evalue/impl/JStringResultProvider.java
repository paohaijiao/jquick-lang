package com.github.paohaijiao.evalue.impl;

import com.github.paohaijiao.anno.JHandlesClass;
import com.github.paohaijiao.evalue.JResultProvider;

@JHandlesClass(String.class)
public class JStringResultProvider implements JResultProvider<String> {
    @Override
    public boolean supports(Class<?> clazz) {
        return String.class.isAssignableFrom(clazz);
    }

    @Override
    public Object getResult(String  input) {
        if (!(input instanceof String)) {
            throw new IllegalArgumentException("Input must be String");
        }
        String str = (String) input;
        return "Processed String: " + str.toUpperCase();
    }
}
