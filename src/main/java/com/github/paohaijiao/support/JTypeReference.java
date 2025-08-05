package com.github.paohaijiao.support;
import com.fasterxml.jackson.core.type.TypeReference;
import com.github.paohaijiao.exception.JAssert;

import java.lang.reflect.*;
import java.util.*;
public class JTypeReference <T> extends TypeReference<T> {

    protected final Type type;

    protected final Class<? super T> rawType;

    protected JTypeReference() {
        Type superClass = getClass().getGenericSuperclass();
        if (superClass instanceof Class<?>) {
            throw new IllegalArgumentException("typeReference requires type parameters");
        }
        this.type = ((ParameterizedType) superClass).getActualTypeArguments()[0];
        this.rawType = (Class<? super T>) getRawType(this.type);
    }

    public JTypeReference(Type type) {
        this.type = type;
        this.rawType = (Class<? super T>) getRawType(type);
    }
    public static class AccessibleJTypeReference<T> extends JTypeReference<T> {
        public AccessibleJTypeReference(Type type) {
            super(type);
        }
    }
    public Class<? super T> getRawType() {
        return rawType;
    }

    public Type getType() {
        return type;
    }

    public Type[] getActualTypeArguments() {
        if (type instanceof ParameterizedType) {
            return ((ParameterizedType) type).getActualTypeArguments();
        }
        return new Type[0];
    }

    public boolean isArray() {
        return type instanceof GenericArrayType ||
                (type instanceof Class<?> && ((Class<?>) type).isArray());
    }

    public Type getArrayComponentType() {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        } else if (type instanceof Class<?> && ((Class<?>) type).isArray()) {
            return ((Class<?>) type).getComponentType();
        }
        throw new IllegalStateException("Not an array type: " + type);
    }

    public static <E> JTypeReference<List<E>> listOf(Class<E> elementType) {
        return new JTypeReference<List<E>>(elementType) ;
    }

    public static <E> JTypeReference<Set<E>> setOf(Class<E> elementType) {
        return new JTypeReference<Set<E>>(elementType) ;
    }

    public static <K, V> JTypeReference<Map<K, V>> mapOf(Class<K> keyType, Class<V> valueType) {
        return new JTypeReference<Map<K, V>>() {};
    }

    public static <E> JTypeReference<E[]> arrayOf(Class<E> elementType) {
        return new JTypeReference<E[]>(elementType) {};
    }

    public static <E> JTypeReference<E[]> varargsOf(Class<E> elementType) {
        return arrayOf(elementType);
    }
    private static Class<?>[] convertToClassArray(JTypeReference<?>[] argTypes) {
        if (argTypes == null) return new Class<?>[0];
        Class<?>[] result = new Class<?>[argTypes.length];
        for (int i = 0; i < argTypes.length; i++) {
            result[i] = argTypes[i].getRawType();
        }
        return result;
    }
    public static <I> JTypeReference<I> interfaceOf(Class<I> interfaceType) {
        return new JTypeReference<I>(interfaceType) ;
    }

    public static <T> JTypeReference<T> of(Class<T> type) {
        return new JTypeReference<T>(type);
    }

    public static <T> JTypeReference<T> of(Type type) {
        return new JTypeReference<T>(type) ;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof JTypeReference<?> && type.equals(((JTypeReference<?>) obj).type);
    }

    @Override
    public int hashCode() {
        return type.hashCode();
    }

    @Override
    public String toString() {
        return type.toString();
    }


    private static Class<?> getRawType(Type type) {
        if (type instanceof com.fasterxml.jackson.databind.JavaType) {// special Type
            return ((com.fasterxml.jackson.databind.JavaType) type).getRawClass();
        }
        if (type instanceof Class<?>) {
            return (Class<?>) type;
        } else if (type instanceof ParameterizedType) {
            return getRawType(((ParameterizedType) type).getRawType());
        } else if (type instanceof WildcardType) {
            return getRawType(((WildcardType) type).getUpperBounds()[0]);
        } else if (type instanceof GenericArrayType) {
            Class<?> componentType = getRawType(((GenericArrayType) type).getGenericComponentType());
            return Array.newInstance(componentType, 0).getClass();
        } else if (type instanceof TypeVariable<?>) {
            TypeVariable<?> tv = (TypeVariable<?>) type;
            Type[] bounds = tv.getBounds();
            if (bounds.length > 0) {
                return getRawType(bounds[0]);
            }
            return Object.class;
        } else {
            JAssert.throwNewException("unsupported type: " + type + " of " + type.getClass());
            return null;
        }
    }
}
