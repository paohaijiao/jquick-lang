package com.github.paohaijiao.enums;

import lombok.Getter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;
@Getter
public enum JiteralEnums {

    string("string", String.class),

    number("number", BigDecimal.class),

    date("date", Date.class),

    variables("variables", Map.class),

    bool("bool", Boolean.class);

    private String code;

    private Class clazz;

    private JiteralEnums(String code, Class clazz) {
        this.code = code;
        this.clazz = clazz;
    }


    public static JiteralEnums codeOf(String code) {
        for (JiteralEnums jiteral : values()) {
            if (code.equals(jiteral.code)) {
                return jiteral;
            }
        }
        return null;
    }
}
