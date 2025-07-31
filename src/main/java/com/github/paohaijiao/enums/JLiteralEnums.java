/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Copyright (c) [2025-2099] Martin (goudingcheng@gmail.com)
 */
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
