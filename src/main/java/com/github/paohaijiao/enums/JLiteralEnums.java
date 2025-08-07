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

import com.github.paohaijiao.support.JTypeReference;
import lombok.Getter;


@Getter
public enum JLiteralEnums {
    String("string", new JTypeReference<String>() {}),
    Date("date", new JTypeReference<java.util.Date>() {}),
    Boolean("boolean", new JTypeReference<Boolean>() {}),
    Null("null", new JTypeReference<Object>() {}),
    Variable("variable", new JTypeReference<Object>() {}),
    Identifier("identifier", new JTypeReference<Object>() {}),

    Int("int", new JTypeReference<Integer>() {}),
    Long("long", new JTypeReference<Long>() {}),
    Short("short", new JTypeReference<Short>() {}),
    Byte("byte", new JTypeReference<Byte>() {}),
    Float("float", new JTypeReference<Float>() {}),
    Double("double", new JTypeReference<Double>() {}),
    Char("char", new JTypeReference<Character>() {}),
    Number("number", new JTypeReference<Number>() {}),

    ClassLiteral("class", new JTypeReference<Class<?>>() {}),
    List("list", new JTypeReference<java.util.List<?>>() {}),
    Map("map", new JTypeReference<java.util.Map<?, ?>>() {}),
    Set("set", new JTypeReference<java.util.Set<?>>() {});
    private String code;

    private JTypeReference<?> typeReference;

    private JLiteralEnums(String code, JTypeReference<?> typeReference) {
        this.code = code;
        this.typeReference = typeReference;
    }

    public static JLiteralEnums codeOf(String code) {
        for (JLiteralEnums jiteral : values()) {
            if (code.equals(jiteral.code)) {
                return jiteral;
            }
        }
        return null;
    }

    public static JLiteralEnums typeOf(JTypeReference<?> typeReference) {
        for (JLiteralEnums jiteral : values()) {
            if (typeReference.getType().equals(jiteral.getTypeReference().getType()) ) {
                return jiteral;
            }
        }
        return null;
    }

}
