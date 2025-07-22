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
import com.github.paohaijiao.model.JFunctionDefinitionModel;
import com.github.paohaijiao.model.JVariableContainerModel;
import com.github.paohaijiao.model.JfunctionParamModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;
/**
 * packageName com.github.paohaijiao.support
 *
 * @author Martin
 * @version 1.0.0
 * @since 2025/7/22
 */
public class JFunctionInvoker {
    private final Map<String, JFunctionDefinitionModel> functionRegistry;
    private final JVariableContainerModel variableContainer;

    public JFunctionInvoker() {
        this.functionRegistry = new HashMap<>();
        this.variableContainer = new JVariableContainerModel();
    }

    public JFunctionInvoker(JVariableContainerModel variableContainer) {
        this.functionRegistry = new HashMap<>();
        this.variableContainer = variableContainer != null ? variableContainer : new JVariableContainerModel();
    }
    public void registerFunction(JFunctionDefinitionModel function) {
        if (function == null || function.getName() == null) {
            throw new IllegalArgumentException("Function definition cannot be null");
        }
        functionRegistry.put(function.getName(), function);
    }
    public boolean hasFunction(String functionName) {
        return functionRegistry.containsKey(functionName);
    }
    public Object invoke(String functionName, List<Object> arguments) {
        if (!hasFunction(functionName)) {
            throw new IllegalArgumentException("Function '" + functionName + "' is not defined");
        }
        JFunctionDefinitionModel function = functionRegistry.get(functionName);
        validateArguments(function, arguments);
        JVariableContainerModel localVariables = new JVariableContainerModel();
        bindParameters(function, arguments, localVariables);
        //todo
        System.out.println("Executing function: " + functionName);
        return null;
    }

    private void validateArguments(JFunctionDefinitionModel function, List<Object> arguments) {
        int expectedCount = function.getParameterCount();
        int actualCount = arguments != null ? arguments.size() : 0;
        if (expectedCount != actualCount) {
            throw new IllegalArgumentException(String.format(
                    "参数数量不匹配。函数 '%s' 需要 %d 个参数，但传入 %d 个",
                    function.getName(), expectedCount, actualCount
            ));
        }
        if (expectedCount == 0) {
            return;
        }

        List<String> paramNames = function.getParameterNames();
        List<String> paramTypes = function.getParameterTypes();
        for (int i = 0; i < expectedCount; i++) {
            String paramName = paramNames.get(i);
            String expectedType = paramTypes.get(i);
            Object actualValue = arguments.get(i);
            if (actualValue == null && !isNullableType(expectedType)) {
                throw new IllegalArgumentException(String.format(
                        "参数 '%s'(位置:%d) 不能为null，需要类型: %s",
                        paramName, i + 1, expectedType
                ));
            }
            if (actualValue != null && !isTypeMatch(expectedType, actualValue)) {
                throw new IllegalArgumentException(String.format(
                        "参数 '%s'(位置:%d) 类型不匹配。需要 %s，但传入 %s",
                        paramName, i + 1, expectedType,
                        actualValue.getClass().getSimpleName()
                ));
            }
        }
    }
    private boolean isTypeMatch(String expectedType, Object actualValue) {
        switch (expectedType.toLowerCase()) {
            case "int":
                return actualValue instanceof Integer;
            case "long":
                return actualValue instanceof Long;
            case "double":
                return actualValue instanceof Double;
            case "float":
                return actualValue instanceof Float;
            case "boolean":
                return actualValue instanceof Boolean;
            case "string":
                return actualValue instanceof String;
            default:
                try {
                    Class<?> expectedClass = Class.forName(expectedType);
                    return expectedClass.isInstance(actualValue);
                } catch (ClassNotFoundException e) {
                    return true;
                }
        }
    }
    private boolean isNullableType(String type) {
        switch (type.toLowerCase()) {
            case "int":
            case "long":
            case "double":
            case "float":
            case "boolean":
                return false;
            default:
                return true;
        }
    }

    private void bindParameters(JFunctionDefinitionModel function,
                                List<Object> arguments,
                                JVariableContainerModel localVariables) {
        List<String> paramNames = function.getParameterNames();
        List<String> paramTypes = function.getParameterTypes();
        for (int i = 0; i < paramNames.size(); i++) {
            String paramName = paramNames.get(i);
            String expectedType = paramTypes.get(i);
            Object argValue = arguments.get(i);
            try {
                Object convertedValue = convertArgument(expectedType, paramName, argValue, i + 1);
                localVariables.set(paramName, convertedValue);
            } catch (Exception e) {
                throw new IllegalArgumentException(String.format(
                        "bindParameters failed - %s(index:%d): %s",
                        paramName, i + 1, e.getMessage()
                ), e);
            }
        }
    }

    private Object convertArgument(String expectedType,
                                   String paramName,
                                   Object argValue,
                                   int position) {
        if (argValue == null) {
            if (!isNullableType(expectedType)) {
                throw new IllegalArgumentException("require not null");
            }
            return null;
        }

        // type match
        if (isTypeMatch(expectedType, argValue)) {
            return argValue;
        }
        // try auto convert
        try {
            switch (expectedType.toLowerCase()) {
                case "int":
                    if (argValue instanceof Number) {
                        return ((Number) argValue).intValue();
                    }
                    return Integer.parseInt(argValue.toString());
                case "long":
                    if (argValue instanceof Number) {
                        return ((Number) argValue).longValue();
                    }
                    return Long.parseLong(argValue.toString());
                case "double":
                    if (argValue instanceof Number) {
                        return ((Number) argValue).doubleValue();
                    }
                    return Double.parseDouble(argValue.toString());
                case "float":
                    if (argValue instanceof Number) {
                        return ((Number) argValue).floatValue();
                    }
                    return Float.parseFloat(argValue.toString());
                case "boolean":
                    if (argValue instanceof Boolean) {
                        return argValue;
                    }
                    return Boolean.parseBoolean(argValue.toString());
                case "string":
                    return argValue.toString();
                default:
                    return attemptCustomConversion(expectedType, argValue);
            }
        } catch (Exception e) {
            throw new IllegalArgumentException(String.format(
                    "failed %s convert to %s: %s",
                    argValue.getClass().getSimpleName(),
                    expectedType,
                    e.getMessage()
            ));
        }
    }

    private Object attemptCustomConversion(String targetType, Object value) {
        // todo add custom convert logic
        throw new IllegalArgumentException("can't support convert: " +
                value.getClass().getName() + " to -> " + targetType);
    }

    public JFunctionDefinitionModel createFunctionDefinition(
            String name, List<JfunctionParamModel> params, String action) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Function name cannot be null or empty");
        }
        List<String> paramNames = new ArrayList<>();
        List<String> paramTypes = new ArrayList<>();
        if (params != null) {
            for (JfunctionParamModel param : params) {
                paramNames.add(param.getName());
                paramTypes.add(param.getType());
            }
        }
        return new JFunctionDefinitionModel(name, paramNames, paramTypes, action);
    }

    public List<String> getRegisteredFunctionNames() {
        return new ArrayList<>(functionRegistry.keySet());
    }


    public JFunctionDefinitionModel getFunctionDefinition(String functionName) {
        return functionRegistry.get(functionName);
    }

    public JVariableContainerModel getVariableContainer() {
        return variableContainer;
    }

    public static void main(String[] args) {
//        List<JfunctionParamModel> params = new ArrayList<>();
//        params.add(new JfunctionParamModel("String", "name"));
//        params.add(new JfunctionParamModel("int", "age"));
//        JFunctionDefinitionModel function = new JFunctionDefinitionModel(
//                "greet",
//                List.of("name", "age"),
//                List.of("String", "int"),
//                "{...}"
//        );
//
//        JVariableContainerModel locals = new JVariableContainerModel();
//        bindParameters(function, List.of("Alice", 30), locals);
//
//        bindParameters(function, List.of("Bob", "25"), locals);
//        bindParameters(function, List.of("Carol", null), locals);
//        bindParameters(function, List.of("Dave", "abc"), locals);
    }
}
