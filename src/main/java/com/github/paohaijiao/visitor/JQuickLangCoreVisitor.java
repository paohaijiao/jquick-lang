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

import com.github.paohaijiao.console.JConsole;
import com.github.paohaijiao.enums.JLiteralEnums;
import com.github.paohaijiao.factory.JFunctionRegistry;
import com.github.paohaijiao.model.JImportContainerModel;
import com.github.paohaijiao.model.JLiteralModel;
import com.github.paohaijiao.param.JContext;
import com.github.paohaijiao.parser.JQuickLangBaseVisitor;
import com.github.paohaijiao.parser.JQuickLangLexer;
import com.github.paohaijiao.parser.JQuickLangParser;
import com.github.paohaijiao.scope.VariableContext;
import com.github.paohaijiao.support.JTypeReference;
import com.github.paohaijiao.type.JGenericlTypeConverter;
import com.google.gson.Gson;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.Stack;


public class JQuickLangCoreVisitor extends JQuickLangBaseVisitor {

    protected JContext context;

    protected CommonTokenStream tokenStream;

    protected JQuickLangLexer lexer ;

    protected JQuickLangParser parser;

    protected Stack<VariableContext> contextStack = new Stack<>();

    protected VariableContext globalContext;

    protected Gson gson=new Gson();

    protected static JConsole console=new JConsole();

    protected JImportContainerModel importContainer=JImportContainerModel.getInstance();


    JFunctionRegistry registry= JFunctionRegistry.getInstance();

    protected void enterScope() {
        VariableContext current = contextStack.peek();
        contextStack.push(new VariableContext(current));
    }
    protected VariableContext currentContext() {
        return contextStack.peek();
    }
    protected void exitScope() {
        if (contextStack.size() > 1) {
            contextStack.pop();
        }
    }

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
    protected Object extract(Object value) {
        if(null==value){
            return null;
        }else if(value instanceof JLiteralModel){
            JLiteralModel literalModel = (JLiteralModel) value;
            return literalModel.getValue();
        }else{
            return value;
        }

    }
    protected JLiteralModel convert(Object value,String literal) {
        if(value==null){
            JLiteralModel model=new JLiteralModel();
            model.setValue(null);
            model.setLiteral("null");
            model.setType(JLiteralEnums.Null);
            return model;
        }else if(value instanceof JLiteralModel){
            return (JLiteralModel)value;
        }else{
            JLiteralModel model=new JLiteralModel();
            model.setValue(value);
            model.setLiteral(literal);
            JTypeReference<?> typeReference=JTypeReference.of(value.getClass());
            JLiteralEnums literalEnums=JLiteralEnums.typeOf(typeReference);
            model.setType(literalEnums);
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
