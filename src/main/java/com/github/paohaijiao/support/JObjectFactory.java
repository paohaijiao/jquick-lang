package com.github.paohaijiao.support;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;

public class JObjectFactory {

    public static Object createByConstructor(String className, List<Object> args) throws Exception {
        Class<?> clazz = Class.forName(className);
        Class<?>[] parameterTypes = getParameterTypes(args);
        Constructor<?> constructor = clazz.getConstructor(parameterTypes);
        return constructor.newInstance(args.toArray());
    }

    public static Object createByStaticMethod(String className, String methodName, List<Object> args) throws Exception {
        Class<?> clazz = Class.forName(className);
        Class<?>[] parameterTypes = getParameterTypes(args);
        Method method = clazz.getMethod(methodName, parameterTypes);
        return method.invoke(null, args.toArray());
    }


    public static Object createByInstanceMethod(Object target, String methodName, List<Object> args) throws Exception {
        Class<?> clazz = target.getClass();
        Class<?>[] parameterTypes = getParameterTypes(args);
        Method method = clazz.getMethod(methodName, parameterTypes);
        return method.invoke(target, args.toArray());
    }

    private static Class<?>[] getParameterTypes(List<Object> args) {
        if (args == null || args.isEmpty()) {
            return new Class<?>[0];
        }

        Class<?>[] parameterTypes = new Class<?>[args.size()];
        for (int i = 0; i < args.size(); i++) {
            Object arg = args.get(i);
            if (arg == null) {
                parameterTypes[i] = Object.class;
                continue;
            }
            parameterTypes[i] = handlePrimitiveTypes(arg.getClass());
            if (arg instanceof Collection) {
                parameterTypes[i] = getCollectionType((Collection<?>) arg, i);
            } else if (arg instanceof Map) {
                parameterTypes[i] = getMapType((Map<?, ?>) arg, i);
            }
        }
        return parameterTypes;
    }
    private static Class<?> handlePrimitiveTypes(Class<?> clazz) {
        if (clazz == Integer.class) return int.class;
        if (clazz == Double.class) return double.class;
        if (clazz == Boolean.class) return boolean.class;
        if (clazz == Long.class) return long.class;
        if (clazz == Float.class) return float.class;
        if (clazz == Short.class) return short.class;
        if (clazz == Byte.class) return byte.class;
        if (clazz == Character.class) return char.class;
        return clazz;
    }
    public static Class<?> getCollectionType(Collection<?> collection, int paramIndex) {
        try {
            if (collection == null) {
                return Collection.class;
            }
            Class<?> collectionClass = collection.getClass();
            if (collectionClass.isInterface()) {
                if (List.class.isAssignableFrom(collectionClass)) {
                    collectionClass = ArrayList.class;
                } else if (Set.class.isAssignableFrom(collectionClass)) {
                    collectionClass = HashSet.class;
                } else {
                    collectionClass = Collection.class;
                }
            }
            if (!collection.isEmpty()) {
                Object firstElement = collection.iterator().next();
                if (firstElement != null) {
                    Class<?> elementType = firstElement.getClass();
                    return elementType;
                }
            }
            return collectionClass;
        } catch (Exception e) {
            throw new IllegalArgumentException("Error determining collection type for parameter at index " + paramIndex, e);
        }
    }
    public static Class<?> getMapType(Map<?, ?> map, int paramIndex) {
        try {
            if (map == null) {
                return Map.class;
            }
            Class<?> mapClass = map.getClass();
            if (mapClass.isInterface()) {
                mapClass = HashMap.class;
            }
            if (!map.isEmpty()) {
                Map.Entry<?, ?> firstEntry = map.entrySet().iterator().next();
                Class<?> keyType = firstEntry.getKey() != null ? firstEntry.getKey().getClass() : Object.class;
                Class<?> valueType = firstEntry.getValue() != null ? firstEntry.getValue().getClass() : Object.class;
                return mapClass;
            }
            return mapClass;
        } catch (Exception e) {
            throw new IllegalArgumentException("Error determining map type for parameter at index " + paramIndex, e);
        }
    }
    public static Type createParameterizedCollectionType(Class<?> collectionClass, Class<?> elementType) {
        return new ParameterizedType() {
            @Override
            public Type[] getActualTypeArguments() {
                return new Type[]{elementType};
            }

            @Override
            public Type getRawType() {
                return collectionClass;
            }

            @Override
            public Type getOwnerType() {
                return null;
            }
        };
    }
    public static Type createParameterizedMapType(Class<?> mapClass, Class<?> keyType, Class<?> valueType) {
        return new ParameterizedType() {
            @Override
            public Type[] getActualTypeArguments() {
                return new Type[]{keyType, valueType};
            }

            @Override
            public Type getRawType() {
                return mapClass;
            }

            @Override
            public Type getOwnerType() {
                return null;
            }
        };
    }

    public static Object create(String className, String methodName, List<Object> args, Boolean isStatic, Object target) throws Exception {
        if (methodName == null) {
            return createByConstructor(className, args);
        } else if (isStatic != null && isStatic) {
            return createByStaticMethod(className, methodName, args);
        } else if (target != null) {
            return createByInstanceMethod(target, methodName, args);
        } else {
            throw new IllegalArgumentException("Invalid combination of parameters for object creation");
        }
    }
}
