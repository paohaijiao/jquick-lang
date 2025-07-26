package com.github.paohaijiao.support;
import com.github.paohaijiao.console.JConsole;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;

public class JObjectFactory {
    public static JConsole console=new JConsole();

    public static Object createByConstructor(String className, List<Object> args) throws Exception {
        Class<?> clazz = Class.forName(className);
        buildArgs(args);
        Class<?>[] parameterTypes = getParameterTypes(args);
        Constructor<?> constructor = clazz.getConstructor(parameterTypes);
        return constructor.newInstance(args.toArray());
    }

    public static Object createByStaticMethod(String className, String methodName, List<Object> args) throws Exception {
        Class<?> clazz = Class.forName(className);
        buildArgs(args);
        Method method = findGenericMethod(clazz, methodName, args);
        return method.invoke(null, args.toArray());
    }


    public static Object createByInstanceMethod(Object target, String methodName, List<Object> args) throws Exception {
        Class<?> clazz = target.getClass();
        buildArgs(args);
        Method method = findGenericMethod(clazz, methodName, args);
        return method.invoke(target, args.toArray());
    }
    private static void buildArgs(List<Object> args){
        for (int i = 0; i < args.size(); i++) {
            Object arg = args.get(i);
            if (arg instanceof List && !(arg instanceof ArrayList)) {
                args.set(i, new ArrayList<>((List<?>) arg));
            }
            if (arg instanceof Map && !(arg instanceof HashMap)) {
                Map m = (Map) arg;
                HashMap map= new HashMap<>();
                map.putAll(m);
                args.set(i, map);
            }
        }
    }
    public static Method findGenericMethod(Class<?> clazz, String methodName, List<Object> args)
            throws NoSuchMethodException {
        Class<?>[] paramTypes = getParameterTypes(args);
        try {
            try {
                return clazz.getMethod(methodName, paramTypes);
            } catch (NoSuchMethodException e) {
                console.info("failed load by getMethod......... ");
            }
            console.info("try to  find method  by best match......... ");
            Method[] methods = clazz.getMethods();
            List<Method> candidates = new ArrayList<>();
            for (Method method : methods) {
                console.info("try to  match method  by ......... "+method.getName());
                if (method.getName().equals(methodName) &&
                        isMatch(method.getParameterTypes(), paramTypes)) {
                    candidates.add(method);
                }
            }
            if (candidates.isEmpty()) {
                throw new NoSuchMethodException("No matching method found: " + methodName);
            }

            if (candidates.size() == 1) {
                return candidates.get(0);
            }
            return findBestMatch(candidates, args);
        } catch (SecurityException e) {
            throw new IllegalArgumentException("Security violation while accessing method", e);
        }
    }


    /**
     * 检查参数类型是否匹配（宽松匹配）
     */
    private static boolean isMatch(Class<?>[] methodParams, Class<?>[] inputParams) {
        if (methodParams.length != inputParams.length) {
            return false;
        }

        for (int i = 0; i < methodParams.length; i++) {
            if (!inputParams[i].isAssignableFrom(methodParams[i])) {
                return false;
            }
        }

        return true;
    }

    private static Method findBestMatch(List<Method> candidates, List<Object> args) throws NoSuchMethodException {

        for (Method method : candidates) {
            Type[] genericParamTypes = method.getGenericParameterTypes();
            boolean match = true;
            for (int i = 0; i < genericParamTypes.length; i++) {
                if (args.get(i)== null) continue;

                if (genericParamTypes[i] instanceof ParameterizedType) {
                    ParameterizedType pt = (ParameterizedType) genericParamTypes[i];
                    Type[] actualTypeArgs = pt.getActualTypeArguments();
                    if (args.get(i) instanceof Collection) {
                        Collection<?> col = (Collection<?>) args.get(i);
                        if (!col.isEmpty()) {
                            Object first = col.iterator().next();
                            if (first != null &&
                                    !actualTypeArgs[0].equals(first.getClass())) {
                                match = false;
                                break;
                            }
                        }
                    }
                }
            }
            if (match) {
                return method;
            }
        }
        return candidates.get(0);
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
                if(arg instanceof List) {
                    parameterTypes[i] = List.class;
                }else{
                    parameterTypes[i] = Collection.class;
                }

            } else if (arg instanceof Map) {
                parameterTypes[i] =Map.class;
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
        if (Collection.class.isAssignableFrom(clazz)) {
            return Collection.class;
        }
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
