package com.github.paohaijiao.factory;
import com.github.paohaijiao.enums.JLiteralEnums;
import com.github.paohaijiao.exception.JAssert;
import com.github.paohaijiao.model.JFunctionDefinitionModel;
import com.github.paohaijiao.model.JFunctionFieldModel;

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

    public JFunctionDefinitionModel lookupFunction(String name,  List<Object> arguments) {
        List<JFunctionDefinitionModel> candidates = functionTable.get(name);
        if (candidates == null) return null;
        if(arguments==null) return null;
        for(int i=0; i<candidates.size(); i++) {
            JFunctionDefinitionModel functionDefinitionModel= candidates.get(i);
            if(functionDefinitionModel.getFields().size()!=arguments.size()) return null;
            for(int j=0; j<functionDefinitionModel.getFields().size(); j++) {
                JFunctionFieldModel define = functionDefinitionModel.getFields().get(j);
                Object value = arguments.get(j);
                Class<?> clazz = value.getClass();
                if(define.getClazz().isPrimitive()){
                    JLiteralEnums cla=JLiteralEnums.classOf(define.getClazz());
                    if(cla==null) return null;
                }else{
                    if(!define.getClazz().equals(clazz)){
                        return null;
                    }
                }
            }
            return functionDefinitionModel;

        }
        return null;
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
