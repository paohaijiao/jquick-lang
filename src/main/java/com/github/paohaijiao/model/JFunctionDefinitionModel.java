package com.github.paohaijiao.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class JFunctionDefinitionModel {

    private final String name;

    List<JFunctionFieldModel> fields=new ArrayList<JFunctionFieldModel>();

    private final String action;

    public JFunctionDefinitionModel(String name, List<JFunctionFieldModel> parameter, String action) {
        this.name = name;
        this.fields = parameter;
        this.action = action;
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
}
