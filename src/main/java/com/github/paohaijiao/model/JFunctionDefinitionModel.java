package com.github.paohaijiao.model;

import java.util.List;
import java.util.Objects;

public class JFunctionDefinitionModel {

    private final String name;

    private final List<String> parameterNames;

    private final List<String> parameterTypes;

    private final String action;

    public JFunctionDefinitionModel(String name, List<String> parameterNames,
                                    List<String> parameterTypes, String action) {
        this.name = name;
        this.parameterNames = parameterNames;
        this.parameterTypes = parameterTypes;
        this.action = action;
    }

    public String getName() {
        return name;
    }
    public List<String> getParameterNames() {
        return parameterNames;
    }
    public List<String> getParameterTypes() {
        return parameterTypes;
    }
    public String getAction() {
        return action;
    }
    public int getParameterCount() {
        return parameterNames.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JFunctionDefinitionModel that = (JFunctionDefinitionModel) o;
        return name.equals(that.name) &&
                parameterNames.equals(that.parameterNames) &&
                parameterTypes.equals(that.parameterTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, parameterNames, parameterTypes);
    }
}
