package com.github.paohaijiao.visitor;


import com.github.paohaijiao.enums.JLiteralEnums;
import com.github.paohaijiao.exception.JAssert;
import com.github.paohaijiao.executor.JQuickLangActionExecutor;
import com.github.paohaijiao.model.*;
import com.github.paohaijiao.parser.JQuickLangParser;
import com.github.paohaijiao.support.JObjectFactory;

import java.util.ArrayList;
import java.util.List;

public class JQuickLangFunctionCallVisitor extends JQuickLangPrimaryVisitor {
    @Override
    public Void visitFunctionDefinition(JQuickLangParser.FunctionDefinitionContext ctx) {
        JAssert.notNull(ctx.IDENTIFIER(), "functionName must not be null");
        String functionName = ctx.IDENTIFIER().getText();
        List<JFunctionFieldModel> paramDefine = new ArrayList<>();
        if (ctx.parameterList() != null) {
            paramDefine=visitParameterList(ctx.parameterList())  ;
        }
        String action = ctx.action().getText();
        JFunctionDefinitionModel jFunctionDefinitionModel =createFunctionDefinition(functionName,paramDefine,action);
        registry.registerFunction(jFunctionDefinitionModel);
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
            JLiteralEnums jLiteralEnums=JLiteralEnums.codeOf(param.getType());
            if(null!=jLiteralEnums){
                model.setClazz(jLiteralEnums.getClazz());
            }else{
                JImportModel importModel= this.importContainer.get(param.getType());
                JAssert.notNull(importModel,"invalid variable claim type");
                model.setClazz(importModel.getClazz());
            }
            list.add(model);
        }
        return list;
    }
    @Override
    public JfunctionParamModel visitParam(JQuickLangParser.ParamContext ctx) {
        JAssert.notNull(ctx.IDENTIFIER(),"the function parameter name is not support");
        JAssert.isTrue(2==ctx.IDENTIFIER().size(),"the function parameter name and type both require not null");
        String paramType=ctx.IDENTIFIER().get(0).getText();
        String paramName=ctx.IDENTIFIER().get(1).getText();
        JAssert.isTrue(this.importContainer.validateType(paramType),"the  parameter type "+paramType+" not import");
        JAssert.notNull(paramName,"the function parameter name "+paramType+" require not null");
        JfunctionParamModel model=new JfunctionParamModel();
        model.setType(paramType);
        model.setName(paramName);
        return model;

    }



    @Override
    public List<Object> visitArgumentList(JQuickLangParser.ArgumentListContext ctx) {
          List<Object> list=new ArrayList<>();
          if(null!=ctx.literal()&&!ctx.literal().isEmpty()){
              for(JQuickLangParser.LiteralContext literalContext:ctx.literal()){
                 Object object= visitLiteral(literalContext);
                 list.add(object);
              }
          }
          return list;
    }
    @Override
    public Object visitStandardCall(JQuickLangParser.StandardCallContext ctx) {
        try {
            String qualifiedName = ctx.qualifiedName() != null ? ctx.qualifiedName().getText() : null;
            String methodName = ctx.IDENTIFIER().getText();
            List<Object> args = visitArgumentList(ctx.argumentList());
            if (qualifiedName != null) {
                return  JObjectFactory.createByStaticMethod(qualifiedName, methodName, args);
            }
            else {
                Object target = resolveVariable(ctx.IDENTIFIER().getText());
                return  JObjectFactory.createByInstanceMethod(target, methodName, args);
            }
        } catch (Exception e) {
            throw new RuntimeException("Method invocation failed: " + ctx.getText(), e);
        }
    }
    @Override
    public Object visitConstructorCall(JQuickLangParser.ConstructorCallContext ctx) {
        try {
            String className = ctx.qualifiedName().getText();
            List<Object> args = visitArgumentList(ctx.argumentList());
            return JObjectFactory.createByConstructor(className, args);
        } catch (Exception e) {
            throw new RuntimeException("Constructor invocation failed: " + ctx.getText(), e);
        }
    }
    @Override
    public Object visitInstanceMethodCall(JQuickLangParser.InstanceMethodCallContext ctx) {
        try {
            Object target;
            if (ctx.instanceName() != null) {
                target = resolveVariable(ctx.instanceName().getText());
            } else {
                target = visit(ctx.variableDecl());
            }
            String methodName = ctx.IDENTIFIER().getText();
            List<Object> args = visitArgumentList(ctx.argumentList());
            return  JObjectFactory.createByInstanceMethod(target, methodName, args);
        } catch (Exception e) {
            throw new RuntimeException("Instance method invocation failed: " + ctx.getText(), e);
        }
    }

    private Object  resolveVariable(String var){
            return this.variableContainer.get(var);
    }

}
