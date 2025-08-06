package com.github.paohaijiao.scope;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;
@Data
public class VariableStorage {

    private final String scopeName;
    private final VariableStorage parentScope;
    private final int scopeLevel;
    private final Map<String, Variable> variables = new HashMap<>();
    public VariableStorage(String scopeName, VariableStorage parentScope) {
        this.scopeName = scopeName;
        this.parentScope = parentScope;
        this.scopeLevel = parentScope != null ? parentScope.scopeLevel + 1 : 0;
    }

    public void addVariable(String name, Class<?> type, Object value, boolean isConstant, String description) {
        if (variables.containsKey(name)) {
            throw new IllegalArgumentException("Variable already exists in this scope: " + name);
        }
        variables.put(name, new Variable(name, type, value, isConstant, description, scopeName, scopeLevel));
    }

    public Variable getVariable(String name) {
        if (variables.containsKey(name)) {//current Scope
            return variables.get(name);
        }
        if (parentScope != null) {//upper scopes
            return parentScope.getVariable(name);
        }

        return null;
    }
    public boolean updateVariable(String name, Object newValue) {
        Variable var = getVariable(name);
        if (var == null) {
            return false;
        }

        VariableStorage current = this;
        while (current != null) {
            if (current.variables.containsKey(name)) {
                current.variables.get(name).setValue(newValue);
                return true;
            }
            current = current.parentScope;
        }

        return false;
    }
    public Map<String, Variable> getCurrentScopeVariables() {
        return new HashMap<>(variables);
    }
    public Map<String, Variable> getAllAccessibleVariables() {
        Map<String, Variable> allVars = new HashMap<>();
        VariableStorage current = this;
        while (current != null) {
            allVars.putAll(current.variables);
            current = current.parentScope;
        }
        return allVars;
    }
    public VariableStorage createChildScope(String childScopeName) {
        return new VariableStorage(childScopeName, this);
    }
}
