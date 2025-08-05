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
package com.github.paohaijiao.visitor;

import com.github.paohaijiao.enums.JLiteralEnums;
import com.github.paohaijiao.exception.JAssert;
import com.github.paohaijiao.factory.JFunctionRegistry;
import com.github.paohaijiao.model.JImportContainerModel;
import com.github.paohaijiao.model.JLiteralModel;
import com.github.paohaijiao.model.JTypeReferenceAndValueModel;
import com.github.paohaijiao.model.JVariableContainerModel;
import com.github.paohaijiao.param.JContext;
import com.github.paohaijiao.parser.JQuickLangBaseVisitor;
import com.github.paohaijiao.parser.JQuickLangLexer;
import com.github.paohaijiao.parser.JQuickLangParser;
import com.github.paohaijiao.support.JTypeReference;
import com.github.paohaijiao.type.JGenericlTypeConverter;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class JQuickLangCoreVisitor extends JQuickLangBaseVisitor {

    protected JContext context;

    protected CommonTokenStream tokenStream;

    protected JQuickLangLexer lexer ;

    protected JQuickLangParser parser;

    protected JImportContainerModel importContainer=JImportContainerModel.getInstance();


    JFunctionRegistry registry= JFunctionRegistry.getInstance();

    protected boolean toBoolean(Object value) {
        if (value instanceof Boolean) {
            return (Boolean) value;
        } else if (value instanceof String) {
            return Boolean.parseBoolean((String) value);
        }
        throw new RuntimeException("cannot convert value to boolean: " + value);
    }
    protected Class<?> loadClass(String className){
        try{
            Class<?> clazz = Class.forName(className);
            return clazz;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    protected  List<JLiteralModel> buildLiteralModels(List<JLiteralModel> literalList){
        List<JLiteralModel> list=new ArrayList<>();
        for(JLiteralModel literalModel:literalList){
            if(literalModel.getType().getCode().equals(JLiteralEnums.Identifier)){
                JLiteralModel model=new JLiteralModel();
                list.add(model);
            }else{
                list.add(literalModel);
            }

        }
        return new ArrayList<>();

    }
    protected JTypeReferenceAndValueModel mergeDataWithTypeReference(List<JLiteralModel> literalList,  JTypeReference<?>[] typeReference){
        JAssert.notNull(literalList,"literalList must not be null");
        JAssert.notNull(typeReference,"typeReference must not be null");
        JTypeReferenceAndValueModel model=new JTypeReferenceAndValueModel();
        if(typeReference.length==0){
            List<JLiteralEnums> literalEnums=literalList.stream().map(JLiteralModel::getType).collect(Collectors.toList());
            List<JLiteralEnums> map=literalEnums.stream().filter(e->e.getCode().equals(JLiteralEnums.Map.getCode())).collect(Collectors.toList());
            if(!map.isEmpty()){
                JAssert.throwNewException("the map parameter must use JTypeReference to convert value");
            }
            List<JLiteralEnums> list=literalEnums.stream().filter(e->e.getCode().equals(JLiteralEnums.List.getCode())).collect(Collectors.toList());
            if(!list.isEmpty()){
                JAssert.throwNewException("the map parameter must use JTypeReference to convert value");
            }
            List<Object> values=literalList.stream().map(JLiteralModel::getValue).collect(Collectors.toList());
            List<JLiteralEnums> literalEnumsList=literalList.stream().map(JLiteralModel::getType).collect(Collectors.toList());
            List<JTypeReference<?>> reference=literalEnumsList.stream().map(JLiteralEnums::getTypeReference).collect(Collectors.toList());
            JTypeReference<?>[] array = reference.stream().toArray(JTypeReference<?>[]::new);
            model.setData(values.toArray());
            model.setTypeArguments(array);
            return model;
        }else{
        //    JAssert.isTrue(literalList.size()==typeReference.length,"the type reference must have the same length");
            List<Object> values=new ArrayList<>();
            for(int i=0;i<literalList.size();i++){
                JLiteralModel literalModel=literalList.get(i);
                if(JLiteralEnums.List.getCode().equals(literalModel.getType().getCode())){
                    JTypeReference<?> reference= typeReference[i];
                    Object data= mergeDataWithTypeReference(literalModel.getLiteral(),reference);
                    values.add(data);
                }else if(JLiteralEnums.Map.getCode().equals(literalModel.getType().getCode())){
                    JTypeReference<?> reference= typeReference[i];
                    Object data= mergeDataWithTypeReference(literalModel.getLiteral(),reference);
                    values.add(data);
                }else{
                    values.add(literalModel.getValue());
                }
            }
            model.setData(values.toArray());
            model.setTypeArguments(typeReference);
            return model;
        }


    }
    protected Object mergeDataWithTypeReference(String data,JTypeReference<?> typeReference){
        JGenericlTypeConverter converter = new JGenericlTypeConverter();
        try {
            return  converter.convert(data,typeReference);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    protected Object[] buildParamArray(List<JLiteralModel> list){
        if(null==list){
            return new Object[]{};
        }else{
           List<Object> data= list.stream().map(JLiteralModel::getValue).collect(Collectors.toList());
            return data.toArray();
        }
    }
    protected List<Object> buildParamList(List<JLiteralModel> list){
        if(null==list){
            return new ArrayList<>();
        }else{
            List<Object> data= list.stream().map(JLiteralModel::getValue).collect(Collectors.toList());
            return data;
        }
    }


    public JFunctionRegistry getRegistry() {
        return registry;
    }

    public JImportContainerModel getImportContainer() {
        return importContainer;
    }
    public JContext getContext() {
        return context;
    }
    public void setContext(JContext context) {
        this.context = context;
    }
    public void setImportContainer(JImportContainerModel importContainer) {
        this.importContainer = importContainer;
    }



}
