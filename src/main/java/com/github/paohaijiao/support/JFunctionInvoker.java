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
import com.github.paohaijiao.enums.JLiteralEnums;
import com.github.paohaijiao.exception.JAssert;
import com.github.paohaijiao.factory.JFunctionRegistry;
import com.github.paohaijiao.model.JFunctionFieldModel;
import com.github.paohaijiao.model.JFunctionDefinitionModel;
import com.github.paohaijiao.model.JVariableContainerModel;
import com.github.paohaijiao.util.JNumberUtil;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 * packageName com.github.paohaijiao.support
 *
 * @author Martin
 * @version 1.0.0
 * @since 2025/7/22
 */
public class JFunctionInvoker {
    JFunctionRegistry registry= JFunctionRegistry.getInstance();
    private final JVariableContainerModel variableContainer;

    public JFunctionInvoker() {
        this.variableContainer = new JVariableContainerModel();
    }

    public JFunctionInvoker(JVariableContainerModel variableContainer) {
        this.variableContainer = variableContainer != null ? variableContainer : new JVariableContainerModel();
    }
    public void registerFunction(JFunctionDefinitionModel function) {
        if (function == null || function.getName() == null) {
            throw new IllegalArgumentException("Function definition cannot be null");
        }
        registry.registerFunction( function);
    }
    public  boolean hasFunction(String functionName) {
        return registry.isFunctionDefined(functionName);
    }
    public  Object invoke(String functionName, List<Object> arguments) {
        if (!hasFunction(functionName)) {
            throw new IllegalArgumentException("Function '" + functionName + "' is not defined");
        }
        JFunctionDefinitionModel function = registry.lookupFunction(functionName,arguments);
        validateArguments(function, arguments);
        JVariableContainerModel localVariables = new JVariableContainerModel();
        bindParameters(function, arguments, localVariables);
        //todo
        System.out.println("Executing function: " + functionName);
        return null;
    }

    private void validateArguments(JFunctionDefinitionModel function, List<Object> arguments) {
        JAssert.notNull(function, "Function cannot be null");
        int expectedCount = function.getParameterCount();
        int actualCount = arguments != null ? arguments.size() : 0;
        if (expectedCount != actualCount) {
            throw new IllegalArgumentException(String.format(
                    "the number of parameters does not match. Function '%s' need %d parameter，but actually %d ",
                    function.getName(), expectedCount, actualCount
            ));
        }
        if (expectedCount == 0) {
            return;
        }

        List<JFunctionFieldModel> fields = function.getFields();
        for (int i = 0; i < expectedCount; i++) {
            JFunctionFieldModel expectedField = fields.get(i);
            Object actualValue = arguments.get(i);
            if (actualValue == null && !isNullableType(expectedField.getClazz())) {
                throw new IllegalArgumentException(String.format(
                        "parameter '%s'(index:%d) can not be null，need type: %s",
                        actualValue.getClass().getSimpleName(), i + 1, expectedField.getClazz().getSimpleName()
                ));
            }
            if (actualValue != null && !isTypeMatch(expectedField.getClazz(), actualValue)) {
                throw new IllegalArgumentException(String.format(
                        "parameter '%s'(index:%d) type ca not match.need %s，but  %s",
                        actualValue.getClass().getSimpleName(), i + 1, expectedField.getClazz().getSimpleName(),
                        actualValue.getClass().getSimpleName()
                ));
            }
        }
    }
    public static boolean isTypeMatch(Class<?> expectedType, Object actualValue) {
        try{
            if(numberClassEqual(expectedType, actualValue)){
                return true;
            }
            expectedType.cast(actualValue);
            return true;
        }catch (Exception e){
            return false;
        }
    }
    public static boolean numberClassEqual(Class<?> clazz,Object value) {
        if(value instanceof Number){
            if(clazz.equals(BigDecimal.class)){
                return true;
            }
            if(clazz.equals(Number.class)){
                return true;
            }
            if(clazz.equals(int.class)){
                return true;
            }
            if(clazz.equals(float.class)){
                return true;
            }
            if(clazz.equals(long.class)){
                return true;
            }
            if(clazz.equals(double.class)){
                return true;
            }
            if(clazz.equals(short.class)){
                return true;
            }
            if(clazz.equals(Integer.class)){
                return true;
            }
            if(clazz.equals(Float.class)){
                return true;
            }
            if(clazz.equals(Long.class)){
                return true;
            }
            if(clazz.equals(Double.class)){
                return true;
            }
            if(clazz.equals(Short.class)){
                return true;
            }
        }
        return false;
    }
    private boolean isNullableType(Class<?> type) {
        switch (type.getSimpleName()) {
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
        List<JFunctionFieldModel> paramTypes = function.getFields();
        for (int i = 0; i < paramNames.size(); i++) {
            String paramName = paramNames.get(i);
            JFunctionFieldModel expectedType = paramTypes.get(i);
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

    private Object convertArgument(JFunctionFieldModel expectedType,
                                   String paramName,
                                   Object argValue,
                                   int position) {
        if (argValue == null) {
            if (!isNullableType(expectedType.getClazz())) {
                throw new IllegalArgumentException("require not null");
            }
            return null;
        }
        if(numberClassEqual(expectedType.getClazz(), argValue)){
            return JNumberUtil.attemptCustomConversion(expectedType.getClazz(), argValue);
        }
        return attemptCustomConversion(expectedType.getClazz(), argValue);

    }

    private Object attemptCustomConversion(Class<?> expectedType, Object value) {
        if(expectedType.isAssignableFrom(value.getClass())){
            return expectedType.cast(value);
        }else{
            throw new IllegalArgumentException("can't support convert: " +
                    value.getClass().getName() + " to -> " + expectedType);
        }



    }

    public static JFunctionDefinitionModel createFunctionDefinition(String name, List<JFunctionFieldModel> paramDefine, String action) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Function name cannot be null or empty");
        }
        return new JFunctionDefinitionModel(name,paramDefine, action);
    }

    public List<String> getRegisteredFunctionNames() {
        return new ArrayList<>(registry.getFunctionTable().keySet());
    }


    public List<JFunctionDefinitionModel> getFunctionDefinition(String functionName) {
        return registry.getFunctionTable().get(functionName);
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
