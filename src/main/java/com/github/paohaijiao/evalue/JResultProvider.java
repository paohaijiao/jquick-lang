package com.github.paohaijiao.evalue;

public interface JResultProvider <T>{

    boolean supports(Class<?> clazz);

    Object getResult(T  input);

    default Object getResultAsObject(Object input) {
        @SuppressWarnings("unchecked")
        T typedInput = (T) input;
        return getResult(typedInput);
    }

}
