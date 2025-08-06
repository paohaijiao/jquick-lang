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
package com.github.paohaijiao.factory;

import com.github.paohaijiao.exception.JAssert;
import com.github.paohaijiao.model.JFunctionDefinitionModel;
import com.github.paohaijiao.model.JFunctionFieldModel;
import com.github.paohaijiao.support.JTypeReference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JFunctionRegistry {
    private static final JFunctionRegistry INSTANCE = new JFunctionRegistry();

    private final Map<String, List<JFunctionDefinitionModel>> functionTable = new HashMap<>();

    public Map<String, List<JFunctionDefinitionModel>> getFunctionTable() {
        return functionTable;
    }

    private JFunctionRegistry() {
    }
    public static JFunctionRegistry getInstance() {
        return INSTANCE;
    }

    public void registerFunction(JFunctionDefinitionModel function) {
        List<String> list=function.getFields().stream().map(JFunctionFieldModel::getFieldName).distinct().collect(Collectors.toList());
        JAssert.isTrue(function.getFields().size() == list.size(),"function params must have the different names");
        functionTable.computeIfAbsent(function.getName(), k -> new ArrayList<>()).add(function);
    }

    public JFunctionDefinitionModel lookupFunction(String name,  JTypeReference<?>[]  arguments) {
        List<JFunctionDefinitionModel> candidates = functionTable.get(name);
        if (candidates == null) return null;
        if(arguments==null) return null;
        for(int i=0; i<candidates.size(); i++) {
            JFunctionDefinitionModel functionDefinitionModel= candidates.get(i);
            if(functionDefinitionModel.getFields().size()!=arguments.length) return null;
            for(int j=0; j<functionDefinitionModel.getFields().size(); j++) {
                JFunctionFieldModel define = functionDefinitionModel.getFields().get(j);
                JTypeReference<?> methodReference= define.getType();
                JTypeReference<?> literalModel = arguments[j];
                if(!methodReference.isAssignableFrom(literalModel)) {
                    return null;
                }
            }
            return functionDefinitionModel;

        }
        return null;
    }

    public boolean isFunctionDefined(String name) {
        return functionTable.containsKey(name);
    }
}
