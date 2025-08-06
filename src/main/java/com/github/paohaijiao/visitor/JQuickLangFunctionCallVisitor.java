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

import com.github.paohaijiao.enums.JNodeType;
import com.github.paohaijiao.exception.JAssert;
import com.github.paohaijiao.executor.JQuickLangActionExecutor;
import com.github.paohaijiao.model.*;
import com.github.paohaijiao.parser.JQuickLangParser;
import com.github.paohaijiao.scope.VariableTree;
import com.github.paohaijiao.support.JReflectionFactory;
import com.github.paohaijiao.support.JTypeReference;
import com.github.paohaijiao.support.impl.JConstructorFactory;
import com.github.paohaijiao.support.impl.JInstanceMethodFactory;
import com.github.paohaijiao.support.impl.JStaticMethodFactory;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.misc.Interval;

import java.util.ArrayList;
import java.util.List;

public class JQuickLangFunctionCallVisitor extends JQuickLangPrimaryVisitor {
    @Override
    public Object  visitFunctionDefinition(JQuickLangParser.FunctionDefinitionContext ctx) {
        JAssert.notNull(ctx.IDENTIFIER(), "functionName must not be null");
        String functionName = ctx.IDENTIFIER().getText();
        VariableTree methodScope = current.createChild(functionName, JNodeType.METHOD);
        List<JFunctionFieldModel> paramDefine = new ArrayList<>();
        if (ctx.parameterList() != null) {
            paramDefine=visitParameterList(ctx.parameterList())  ;
        }
        if (ctx.parameterList() != null) {
            for (JQuickLangParser.ParamContext paramCtx : ctx.parameterList().param()) {
                JTypeReference<?> paramType = visitClasssType(paramCtx.classsType());
                String paramName = paramCtx.functionVar().getText();
                methodScope.addVariable(paramName, paramType, paramType);
            }
        }
        int startIndex = ctx.action().start.getTokenIndex();
        int stopIndex = ctx.action().stop.getTokenIndex();
        String action = tokenStream.getText(Interval.of(startIndex, stopIndex));
        TokenStreamRewriter rewriter = new TokenStreamRewriter(tokenStream);
        JFunctionDefinitionModel jFunctionDefinitionModel =createFunctionDefinition(functionName,paramDefine,action);
        registry.registerFunction(jFunctionDefinitionModel);
        current=getParentVariableTree();
        //VariableStorage variableStorage=methodScope.getParentScope();
//        parser.exitScope();
//        parser.addVariable(functionName, null, ctx, null, ctx.getStart().getLine());
        return null;
    }
    @Override
    public List<JFunctionFieldModel> visitParameterList(JQuickLangParser.ParameterListContext ctx) {
        List<JFunctionFieldModel> list=new ArrayList<>();
        for (int i = 0; i < ctx.param().size(); i++) {
            JFunctionFieldModel model=new JFunctionFieldModel();
            JfunctionParamModel param=visitParam(ctx.param().get(i));
            model.setIndex(i);
            model.setFieldName(param.getName());
            model.setType(param.getType());
            list.add(model);
        }
        return list;
    }
    @Override
   public JTypeReference<?>  visitClasssType(JQuickLangParser.ClasssTypeContext ctx) {
        if(ctx.importVar()!=null){
            return importContainer.get(ctx.importVar().getText());
        }else if(ctx.paramType()!=null){
            return visitParamType(ctx.paramType());
        }
        JAssert.throwNewException("visitFunctionType not implemented");
        return null;
    }

    @Override
    public JfunctionParamModel visitParam(JQuickLangParser.ParamContext ctx) {
        JfunctionParamModel model=new JfunctionParamModel();
        if(ctx.functionVar() != null) {
            model.setName(visitFunctionVar(ctx.functionVar()));
        }
        if(ctx.classsType() != null) {
            model.setType(visitClasssType(ctx.classsType()));
        }
        return model;
    }


    @Override
    public List<JLiteralModel> visitArgumentList(JQuickLangParser.ArgumentListContext ctx) {
        List<JLiteralModel> list = new ArrayList<>();
        if (null != ctx.literal() && !ctx.literal().isEmpty()) {
            for (JQuickLangParser.LiteralContext literalContext : ctx.literal()) {
                JLiteralModel object = visitLiteral(literalContext);
                list.add(object);
            }
        }
        return list;
    }
    @Override
    public Object visitStaticCall(JQuickLangParser.StaticCallContext ctx) {
        JAssert.notNull(ctx.qualifiedName(),"the class name is not support");
        JAssert.notNull(ctx.methodName(),"the method name is not support");
        String qualifiedName = ctx.qualifiedName() != null ? ctx.qualifiedName().getText() : null;
        String methodName = visitMethodName(ctx.methodName());
        List<JLiteralModel> args = new ArrayList<>();
        if(null!=ctx.argumentList()&&null!=ctx.argumentList().literal()&&ctx.argumentList().literal().size()>0){
            args=visitArgumentList(ctx.argumentList());
        }
        JTypeReference<?>[] typeReferences = new JTypeReference<?>[0];
        if (null != ctx.typeArguments() ) {
            typeReferences = visitTypeArguments(ctx.typeArguments());
        }
        try {
            Class<?> clazz = loadClass(qualifiedName);
            JTypeReferenceAndValueModel typeReferenceAndValueModel=mergeDataWithTypeReference(args,typeReferences);
            JStaticMethodFactory instance = JReflectionFactory.staticMethod(clazz);
            return instance.invoke(methodName, typeReferenceAndValueModel.getTypeArguments(), typeReferenceAndValueModel.getData());
        } catch (Exception e) {
            throw new RuntimeException("please double check static method invocation : " + methodName, e);
        }

    }
    @Override
    public Object visitConstructorCall(JQuickLangParser.ConstructorCallContext ctx) {
        JAssert.notNull(ctx.qualifiedName(),"the class name is not support");
        List<JLiteralModel> args = new ArrayList<>();
        if(null!=ctx.argumentList()&&null!=ctx.argumentList().literal()&&ctx.argumentList().literal().size()>0){
            args=visitArgumentList(ctx.argumentList());
        }
        JTypeReference<?>[] typeReferences = new JTypeReference<?>[0];
        if(null!=ctx.typeArguments()&&!ctx.typeArguments().isEmpty()){
            typeReferences= visitTypeArguments(ctx.typeArguments());
        }
        String qualifiedName = ctx.qualifiedName() != null ? ctx.qualifiedName().getText() : null;
        try {
            Class<?> clazz=loadClass(qualifiedName);
            JConstructorFactory<?> instance =JReflectionFactory.constructor(clazz);
            JTypeReferenceAndValueModel typeReferenceAndValueModel=mergeDataWithTypeReference(args,typeReferences);
            return instance.newInstance(typeReferenceAndValueModel.getTypeArguments(),typeReferenceAndValueModel.getData());
        } catch (Exception e) {
            throw new RuntimeException("please double check constructor method   " , e);
        }
    }
    @Override
    public Object visitInstanceMethodCall(JQuickLangParser.InstanceMethodCallContext ctx) {
        JAssert.notNull(ctx.instanceName(),"the instanceName  is not support"+ctx.instanceName());
        JAssert.notNull(ctx.methodName(),"the method name is not support: "+ctx.methodName().getText());
        String methodName = visitMethodName(ctx.methodName());
        Object target=null;
        if (ctx.instanceName() != null) {
            target = resolveVariable(ctx.instanceName().getText());
        }
        JAssert.notNull(target,"the target object is not support:"+ctx.instanceName().getText());
        List<JLiteralModel> args = new ArrayList<>();
        if(null!=ctx.argumentList()&&null!=ctx.argumentList().literal()&&ctx.argumentList().literal().size()>0){
            args=visitArgumentList(ctx.argumentList());
        }
        JTypeReference<?>[] typeReferences = new JTypeReference<?>[0];
        if(null!=ctx.typeArguments()&&!ctx.typeArguments().isEmpty()){
            typeReferences= visitTypeArguments(ctx.typeArguments());
        }
        try {
            JInstanceMethodFactory instance =JReflectionFactory.instanceMethod(target);
            JTypeReferenceAndValueModel typeReferenceAndValueModel=mergeDataWithTypeReference(args,typeReferences);
            return instance.invoke(methodName,typeReferenceAndValueModel.getTypeArguments(),typeReferenceAndValueModel.getData());
        } catch (Exception e) {
            throw new RuntimeException("please double check constructor method   " , e);
        }
    }
    @Override
    public Object visitThisMethodCall(JQuickLangParser.ThisMethodCallContext ctx) {
        JAssert.notNull(ctx.methodName(),"the method name not support");
        String methodName = visitMethodName(ctx.methodName());
        boolean flag=this.hasFunction(methodName);
        JAssert.isTrue(flag,"the method [ "+methodName+" ] did not define in this context");
        List<JLiteralModel> args = new ArrayList<>();
        if(null!=ctx.argumentList()&&null!=ctx.argumentList().literal()&&!ctx.argumentList().literal().isEmpty()){
            args=visitArgumentList(ctx.argumentList());
        }
        JTypeReference<?>[] typeReferences = new JTypeReference<?>[0];
        if(null!=ctx.typeArguments()&&!ctx.typeArguments().isEmpty()){
            typeReferences= visitTypeArguments(ctx.typeArguments());
        }
        JTypeReferenceAndValueModel typeReferenceAndValueModel=mergeDataWithTypeReference(args,typeReferences);
        JFunctionDefinitionModel function = registry.lookupFunction(methodName,typeReferenceAndValueModel.getTypeArguments());//find the best match method
        JAssert.notNull(function,"can't find function ["+methodName+"] based the parameter [ "+args+" ] you gived");
        JVariableContainerModel varModel= super.invoke(methodName,typeReferenceAndValueModel);
        JQuickLangActionExecutor executor=new JQuickLangActionExecutor();
        executor.intExecuteEnv(this.context,varModel);
        Object object=executor.execute(function.getAction());
        return object;
    }
    @Override
    public Object visitAccessStaticMethodCall(JQuickLangParser.AccessStaticMethodCallContext ctx) {
        JAssert.notNull(ctx.accessStaticVariable(),"the accessStaticVariable is not support");
        JAssert.notNull(ctx.methodName(),"the method name is not support");
        String methodName = visitMethodName(ctx.methodName());
        try {
            Object target=visitAccessStaticVariable(ctx.accessStaticVariable());
            List<JLiteralModel> args = new ArrayList<>();
            if(null!=ctx.argumentList()&&null!=ctx.argumentList().literal()&&ctx.argumentList().literal().size()>0){
                args=visitArgumentList(ctx.argumentList());
            }
            return null;
//            return  JObjectFactory.createByInstanceMethod(target, methodName, args);
        } catch (Exception e) {
            throw new RuntimeException("please double check static method invocation : " + methodName, e);
        }

    }

    @Override
    public Object visitInstanceName(JQuickLangParser.InstanceNameContext ctx) {
        return resolveVariable(ctx.IDENTIFIER().getText());
    }
    @Override
    public String visitMethodName(JQuickLangParser.MethodNameContext ctx) {
        JAssert.notNull(ctx.IDENTIFIER(), "the function name  is not null");
        return ctx.IDENTIFIER().getText();
    }

    private Object  resolveVariable(String var){
        return this.context.get(var);
    }

    @Override
    public String visitFunctionVar(JQuickLangParser.FunctionVarContext ctx) {
        return ctx.IDENTIFIER().getText();
    }


}
