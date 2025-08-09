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
package com.github.paohaijiao;

import com.github.paohaijiao.scope.VariableContext;
import com.github.paohaijiao.service.JService;
import com.github.paohaijiao.support.JTypeReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * packageName com.github.paohaijiao
 *
 * @author Martin
 * @version 1.0.0
 * @since 2025/8/9
 */
public class JVariableContextBuilder {
    public static Stack<VariableContext> mockData(){
        VariableContext variableContext=new VariableContext();
        List<Integer> listVar = new ArrayList<Integer>() {
        };
        listVar.addAll(Arrays.asList(1, 2, 3));
        Stack<VariableContext> contextStack = new Stack<VariableContext>();
        variableContext.addVariable("testObj", new JService(), JTypeReference.of(JService.class));
        variableContext.addVariable("listVar", listVar, JTypeReference.listOf(Integer.class));
        contextStack.add(variableContext);
        return contextStack;
    }
}
