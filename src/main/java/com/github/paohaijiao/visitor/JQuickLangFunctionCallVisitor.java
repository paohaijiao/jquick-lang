package com.github.paohaijiao.visitor;


import com.github.paohaijiao.enums.JLiteralEnums;
import com.github.paohaijiao.exception.JAssert;
import com.github.paohaijiao.executor.JQuickLangActionExecutor;
import com.github.paohaijiao.model.*;
import com.github.paohaijiao.parser.JQuickLangParser;

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
    public Object visitFunctionCall(JQuickLangParser.FunctionCallContext ctx) {
        JAssert.notNull(ctx.IDENTIFIER(), "functionName must not be null");
        String functionName = ctx.IDENTIFIER().getText();
        List<Object> paramList=visitArgumentList(ctx.argumentList());
        JFunctionDefinitionModel def = registry.lookupFunction(functionName, paramList);
        JVariableContainerModel variableContainerModel=invoke(functionName,paramList);
        JQuickLangActionExecutor executor=new JQuickLangActionExecutor(this.context,variableContainerModel);
        return executor.execute(def.getAction());
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


}
