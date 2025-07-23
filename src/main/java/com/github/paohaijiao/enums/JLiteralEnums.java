package com.github.paohaijiao.enums;

import lombok.Getter;


@Getter
public enum JLiteralEnums {



    Int("int", Integer.class),

    Long("long", Long.class),

    Short("short", Short.class),

    Byte("byte", byte.class),

    Float("float", Float.class),

    Double("double", Double.class),

    Boolean("boolean", Boolean.class),

    Char("char", Character.class);

    private String code;

    private Class clazz;

    private JLiteralEnums(String code, Class clazz) {
        this.code = code;
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
}
