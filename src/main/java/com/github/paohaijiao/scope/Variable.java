package com.github.paohaijiao.scope;

import com.github.paohaijiao.support.JTypeReference;
import lombok.Data;

@Data
public class Variable {
    private final String name;
    private final  JTypeReference<?> type;
    private Object value;
    private final boolean isConstant;
    private final String description;
    private final String scope;
    private final int scopeLevel;

    public Variable(String name, JTypeReference<?> type, Object value, boolean isConstant, String description, String scope, int scopeLevel) {
        this.name = name;
        this.type = type;
        this.value = value;
        this.isConstant = isConstant;
        this.description = description;
        this.scope = scope;
        this.scopeLevel = scopeLevel;
    }
}
