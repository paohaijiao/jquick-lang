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

import com.github.paohaijiao.factory.JFunctionRegistry;
import com.github.paohaijiao.model.JImportContainerModel;
import com.github.paohaijiao.model.JLiteralModel;
import com.github.paohaijiao.model.JVariableContainerModel;
import com.github.paohaijiao.param.JContext;
import com.github.paohaijiao.parser.JQuickLangBaseVisitor;
import com.github.paohaijiao.parser.JQuickLangLexer;
import com.github.paohaijiao.parser.JQuickLangParser;
import com.github.paohaijiao.support.JTypeReference;
import com.github.paohaijiao.type.JGenericlTypeConverter;
import org.antlr.v4.runtime.CommonTokenStream;

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
           List<Object> data= list.stream().map(e->e.getValue()).collect(Collectors.toList());
            return data.toArray();
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
