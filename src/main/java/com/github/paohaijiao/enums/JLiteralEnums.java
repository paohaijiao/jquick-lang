package com.github.paohaijiao.enums;

import lombok.Getter;


@Getter
public enum JLiteralEnums {



    Int("int", int.class,Integer.class),

    Long("long",long.class, Long.class),

    Short("short",short.class, Short.class),

    Byte("byte", byte.class,Byte.class),

    Float("float", float.class, Float.class),

    Double("double", double.class, Double.class),

    Boolean("boolean",boolean.class,  Boolean.class),

    Char("char",char.class , Character.class);

    private String code;

    private Class clazz;

    private Class alias;

    private JLiteralEnums(String code, Class clazz, Class alias) {
        this.code = code;
        this.alias = alias;
        this.clazz = clazz;
    }


    public static JLiteralEnums codeOf(String code) {
        for (JLiteralEnums jiteral : values()) {
            if (code.equals(jiteral.code)) {
                return jiteral;
            }
        }
        return null;
    }
    public static JLiteralEnums classOf(Class<?> clazz) {
        for (JLiteralEnums jiteral : values()) {
            if (clazz.equals(jiteral.getClazz())||clazz.equals(jiteral.getAlias())) {
                return jiteral;
            }
        }
        return null;
    }
}
