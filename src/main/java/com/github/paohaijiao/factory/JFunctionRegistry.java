package com.github.paohaijiao.factory;
import com.github.paohaijiao.model.JFunctionDefinitionModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class JFunctionRegistry {
    private static final JFunctionRegistry INSTANCE = new JFunctionRegistry();

    private final Map<String, List<JFunctionDefinitionModel>> functionTable = new HashMap<>();
    private JFunctionRegistry() {
    }
    public static JFunctionRegistry getInstance() {
        return INSTANCE;
    }

    public void registerFunction(JFunctionDefinitionModel function) {
        functionTable.computeIfAbsent(function.getName(), k -> new ArrayList<>())
                .add(function);
    }

    public JFunctionDefinitionModel lookupFunction(String name, List<String> argumentTypes) {
        List<JFunctionDefinitionModel> candidates = functionTable.get(name);
        if (candidates == null) return null;
        for (JFunctionDefinitionModel def : candidates) {
            if (matchesParameters(def, argumentTypes)) {
                return def;
            }
        }
        return null;
    }

    public JFunctionDefinitionModel lookupFunction(String name, List<String> parameterNames,
                                                   List<String> parameterTypes) {
        List<JFunctionDefinitionModel> candidates = functionTable.get(name);
        if (candidates == null) return null;
        for (JFunctionDefinitionModel def : candidates) {
            if (def.getParameterNames().equals(parameterNames) &&
                    def.getParameterTypes().equals(parameterTypes)) {
                return def;
            }
        }
        return null;
    }

    private boolean matchesParameters(JFunctionDefinitionModel def, List<String> argumentTypes) {
        if (def.getParameterCount() != argumentTypes.size()) {
            return false;
        }
        List<String> paramTypes = def.getParameterTypes();
        for (int i = 0; i < paramTypes.size(); i++) {
            if (!isTypeCompatible(paramTypes.get(i), argumentTypes.get(i))) {
                return false;
            }
        }
        return true;
    }

    private boolean isTypeCompatible(String expectedType, String actualType) {
        if (expectedType.equals(actualType)){
            return true;
        }else{
            return false;
        }
    }

    public boolean isFunctionDefined(String name) {
        return functionTable.containsKey(name);
    }
}
