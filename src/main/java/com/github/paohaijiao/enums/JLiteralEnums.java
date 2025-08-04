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

import com.fasterxml.jackson.core.type.TypeReference;
import com.github.paohaijiao.support.JTypeReference;
import lombok.Getter;


@Getter
public enum JLiteralEnums {
    String("string", new JTypeReference<String>() {}, new JTypeReference<String>() {}),
    Date("date", new JTypeReference<java.util.Date>() {}, new JTypeReference<java.util.Date>() {}),
    Boolean("boolean", new JTypeReference<Boolean>() {}, new JTypeReference<Boolean>() {}),
    Null("null", new JTypeReference<Object>() {}, new JTypeReference<Object>() {}),
    Variable("variable", new JTypeReference<Object>() {}, new JTypeReference<Object>() {}),
    Identifier("identifier", new JTypeReference<Object>() {}, new JTypeReference<Object>() {}),

    Int("int", new JTypeReference<Integer>() {}, new JTypeReference<Integer>() {}),
    Long("long", new JTypeReference<Long>() {}, new JTypeReference<Long>() {}),
    Short("short", new JTypeReference<Short>() {}, new JTypeReference<Short>() {}),
    Byte("byte", new JTypeReference<Byte>() {}, new JTypeReference<Byte>() {}),
    Float("float", new JTypeReference<Float>() {}, new JTypeReference<Float>() {}),
    Double("double", new JTypeReference<Double>() {}, new JTypeReference<Double>() {}),
    Char("char", new JTypeReference<Character>() {}, new JTypeReference<Character>() {}),

    ClassLiteral("class", new JTypeReference<Class<?>>() {}, new JTypeReference<Class<?>>() {}),
    List("list", new JTypeReference<java.util.List<?>>() {}, new JTypeReference<java.util.List<?>>() {}),
    Map("map", new JTypeReference<java.util.Map<?, ?>>() {}, new JTypeReference<java.util.Map<?, ?>>() {});
    private String code;
    private JTypeReference<?> typeReference;
    private JTypeReference<?> aliasTypeReference;

    private JLiteralEnums(String code, JTypeReference<?> typeReference, JTypeReference<?> aliasTypeReference) {
        this.code = code;
        this.typeReference = typeReference;
        this.aliasTypeReference = aliasTypeReference;
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
            if (typeReference.getType().equals(jiteral.getTypeReference().getType()) ||
                    typeReference.getType().equals(jiteral.getAliasTypeReference().getType())) {
                return jiteral;
            }
        }
        return null;
    }

}
