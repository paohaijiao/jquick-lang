package com.github.paohaijiao.factory;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.github.paohaijiao.console.JConsole;
import com.github.paohaijiao.support.JTypeReference;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class JTypeReferenceFactory {
    private static JConsole console=new JConsole();
    private static final ObjectMapper mapper = new ObjectMapper();

    private static final TypeFactory typeFactory = mapper.getTypeFactory();


    public static JTypeReference<?> fromClassName(String className) {
        try {
            Class<?> clazz = Class.forName(className);
            return new JTypeReference<>(clazz);
        } catch (ClassNotFoundException e) {
            console.error("class not found: " + className, e);
            return null;
        }
    }

    public static JTypeReference<?> listFromElementType(String elementTypeClassName) {
        try {
            Class<?> elementType = Class.forName(elementTypeClassName);
            JavaType listType = typeFactory.constructCollectionType(List.class, elementType);
            return new JTypeReference.AccessibleJTypeReference<Object>(listType);
        } catch (ClassNotFoundException e) {
            console.error("listFromElementType not found: " , e);
            return null;
        }
    }

    public static JTypeReference<?> setFromElementType(String elementTypeClassName) {
        try {
            Class<?> elementType = Class.forName(elementTypeClassName);
            JavaType javaType = typeFactory.constructCollectionType(Set.class, elementType);
            return new JTypeReference<Object>(javaType) {};
        } catch (ClassNotFoundException e) {
            console.error("class not found: " + elementTypeClassName, e);
            return null;
        }
    }

    public static JTypeReference<?> mapFromTypes(String keyTypeClassName, String valueTypeClassName) {
        try {
            Class<?> keyType = Class.forName(keyTypeClassName);
            Class<?> valueType = Class.forName(valueTypeClassName);
            JavaType javaType = typeFactory.constructMapType(Map.class, keyType, valueType);
            return new JTypeReference<Object>(javaType) {};
        } catch (ClassNotFoundException e) {
            console.error("class not found", e);
            return null;
        }
    }

    public static JTypeReference<?> arrayFromElementType(String elementTypeClassName) {
        try {
            Class<?> elementType = Class.forName(elementTypeClassName);
            JavaType javaType = typeFactory.constructArrayType(elementType);
            return new JTypeReference<Object>(javaType) {};
        } catch (ClassNotFoundException e) {
            console.error("class not found "+ elementTypeClassName, e);
            return null;
        }
    }

    public static JTypeReference<?> fromTypeString(String typeString) {
        try {
            JavaType javaType = typeFactory.constructFromCanonical(typeString);
            return new JTypeReference<Object>(javaType) {};
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}
