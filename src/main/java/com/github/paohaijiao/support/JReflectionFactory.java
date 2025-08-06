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
package com.github.paohaijiao.support;
import com.github.paohaijiao.support.impl.JConstructorFactory;
import com.github.paohaijiao.support.impl.JInstanceMethodFactory;
import com.github.paohaijiao.support.impl.JStaticMethodFactory;


public class JReflectionFactory {


    private JReflectionFactory() {

    }

    public static JStaticMethodFactory staticMethod(Class<?> clazz) {
        return new JStaticMethodFactory(clazz);
    }



    public static JInstanceMethodFactory instanceMethod(Object target) {
        return new JInstanceMethodFactory(target);
    }



    public static <T> JConstructorFactory<T> constructor(Class<T> clazz) {
        return new JConstructorFactory<>(clazz);
    }









}
