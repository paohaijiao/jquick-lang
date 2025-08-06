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
package com.github.paohaijiao.support.impl;

import com.github.paohaijiao.support.JTypeReference;

import java.util.Objects;

public class JStaticMethodFactory {
    private final Class<?> clazz;

    public JStaticMethodFactory(Class<?> clazz) {
        this.clazz = Objects.requireNonNull(clazz, "Class cannot be null");
    }

    public <R> R invoke(String methodName, JTypeReference<?>[] argTypes, Object... args) {
        return JMethodInvoker.invoke(null, clazz, methodName, argTypes, args);
    }

    public <R> R invoke(String methodName) {
        return invoke(methodName, new JTypeReference<?>[0]);
    }

    public <R> R invoke(String methodName, JTypeReference<?> argType, Object arg) {
        return invoke(methodName, new JTypeReference<?>[]{argType}, arg);
    }
}
