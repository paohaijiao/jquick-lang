package com.github.paohaijiao.factory;

import com.github.paohaijiao.evalue.JResultProvider;
import com.github.paohaijiao.exception.JAssert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JResultProviderFactory {

    public final Map<Class<?>, JResultProvider<?>> providers = new HashMap<>();

    public <T> void registerProvider(Class clazz, JResultProvider provider) {
        providers.put(clazz, provider);
    }
    public Object route(Class<?> clazz, Object input) {
        JResultProvider<Object> provider = (JResultProvider<Object>) providers.get(input.getClass());
        if (provider != null) {
            return provider.getResult(input);
        }
        JAssert.throwNewException("No provider found for class: " + clazz.getName());
        return null;
    }
}
