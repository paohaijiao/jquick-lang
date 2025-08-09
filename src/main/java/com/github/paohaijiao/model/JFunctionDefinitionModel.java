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
package com.github.paohaijiao.model;

import com.github.paohaijiao.support.JTypeReference;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class JFunctionDefinitionModel {

    private final String name;

    List<JFunctionFieldModel> fields=new ArrayList<JFunctionFieldModel>();

    private final String action;

    private JTypeReference<?> returnType;

    public JFunctionDefinitionModel(String name, List<JFunctionFieldModel> parameter, String action,JTypeReference<?> type) {
        this.name = name;
        this.fields = parameter;
        this.action = action;
        this.returnType = type;
    }

    public String getName() {
        return name;
    }
    public List<String> getParameterNames() {
        return fields.stream().map(JFunctionFieldModel::getFieldName).collect(Collectors.toList());
    }
    public String getAction() {
        return action;
    }
    public int getParameterCount() {
        return fields.size();
    }

    public List<JFunctionFieldModel> getFields() {
        return fields;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JFunctionDefinitionModel that = (JFunctionDefinitionModel) o;
        if (!Objects.equals(name, that.name)) return false;
//        if (!Objects.equals(returnType, that.returnType)) return false;
        if (fields.size() != that.fields.size()) return false;

        for (int i = 0; i < fields.size(); i++) {
            if (!Objects.equals(fields.get(i), that.fields.get(i))) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
//        result = 31 * result + Objects.hashCode(returnType);
        result = 31 * result + fields.hashCode();
        return result;
    }

    public JTypeReference<?> getReturnType() {
        return returnType;
    }
}
