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
import lombok.Getter;


@Getter
public enum JLiteralEnums {
    String("string", new TypeReference<String>() {}, new TypeReference<String>() {}),
    Date("date", new TypeReference<java.util.Date>() {}, new TypeReference<java.util.Date>() {}),
    Boolean("boolean", new TypeReference<Boolean>() {}, new TypeReference<Boolean>() {}),
    Null("null", new TypeReference<Object>() {}, new TypeReference<Object>() {}),
    Variable("variable", new TypeReference<Object>() {}, new TypeReference<Object>() {}),
    Identifier("identifier", new TypeReference<Object>() {}, new TypeReference<Object>() {}),

    Int("int", new TypeReference<Integer>() {}, new TypeReference<Integer>() {}),
    Long("long", new TypeReference<Long>() {}, new TypeReference<Long>() {}),
    Short("short", new TypeReference<Short>() {}, new TypeReference<Short>() {}),
    Byte("byte", new TypeReference<Byte>() {}, new TypeReference<Byte>() {}),
    Float("float", new TypeReference<Float>() {}, new TypeReference<Float>() {}),
    Double("double", new TypeReference<Double>() {}, new TypeReference<Double>() {}),
    Char("char", new TypeReference<Character>() {}, new TypeReference<Character>() {}),

    ClassLiteral("class", new TypeReference<Class<?>>() {}, new TypeReference<Class<?>>() {}),
    List("list", new TypeReference<java.util.List<?>>() {}, new TypeReference<java.util.List<?>>() {}),
    Map("map", new TypeReference<java.util.Map<?, ?>>() {}, new TypeReference<java.util.Map<?, ?>>() {});
    private String code;
    private TypeReference<?> typeReference;
    private TypeReference<?> aliasTypeReference;

    private JLiteralEnums(String code, TypeReference<?> typeReference, TypeReference<?> aliasTypeReference) {
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

    public static JLiteralEnums typeOf(TypeReference<?> typeReference) {
        for (JLiteralEnums jiteral : values()) {
            if (typeReference.getType().equals(jiteral.getTypeReference().getType()) ||
                    typeReference.getType().equals(jiteral.getAliasTypeReference().getType())) {
                return jiteral;
            }
        }
        return null;
    }

}
