package com.github.paohaijiao.scope;

public class Variable {
    private final String name;
    private final Class<?> type;
    private Object value;
    private final boolean isConstant;
    private final String description;
    private final String scope;
    private final int scopeLevel;

    public Variable(String name, Class<?> type, Object value, boolean isConstant, String description, String scope, int scopeLevel) {
        this.name = name;
        this.type = type;
        this.value = value;
        this.isConstant = isConstant;
        this.description = description;
        this.scope = scope;
        this.scopeLevel = scopeLevel;
    }

    // Getters and Setters
    public String getName() { return name; }
    public Class<?> getType() { return type; }
    public Object getValue() { return value; }
    public boolean isConstant() { return isConstant; }
    public String getDescription() { return description; }
    public String getScope() { return scope; }
    public int getScopeLevel() { return scopeLevel; }

    public void setValue(Object value) {
        if (isConstant) {
            throw new IllegalStateException("Cannot modify constant variable: " + name);
        }
        this.value = value;
    }
}
