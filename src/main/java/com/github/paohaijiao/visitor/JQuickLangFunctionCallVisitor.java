package com.github.paohaijiao.visitor;


import cn.hutool.core.lang.Assert;
import com.github.paohaijiao.enums.JiteralEnums;
import com.github.paohaijiao.exception.JAssert;
import com.github.paohaijiao.model.JFunctionDefinitionModel;
import com.github.paohaijiao.model.JfunctionParamModel;
import com.github.paohaijiao.parser.JQuickLangParser;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JQuickLangFunctionCallVisitor extends JQuickLangPrimaryVisitor {
    @Override
    public Void visitFunctionDefinition(JQuickLangParser.FunctionDefinitionContext ctx) {
        JAssert.notNull(ctx.IDENTIFIER(), "functionName must not be null");
        String functionName = ctx.IDENTIFIER().getText();
        List<String> paramNames = new ArrayList<>();
        List<String> paramTypes = new ArrayList<>();
        if (ctx.parameterList() != null) {
            List<JfunctionParamModel>  params=visitParameterList(ctx.parameterList())  ;
            paramNames.addAll(params.stream().map(JfunctionParamModel::getName).collect(Collectors.toList()));
            paramTypes.addAll(params.stream().map(JfunctionParamModel::getType).collect(Collectors.toList()));
        }
        String action = ctx.action().getText();
        JFunctionDefinitionModel jFunctionDefinitionModel = new JFunctionDefinitionModel(functionName, paramNames, paramTypes, action);
        registry.registerFunction(jFunctionDefinitionModel);
        return null;

    }
    @Override
    public List<JfunctionParamModel> visitParameterList(JQuickLangParser.ParameterListContext ctx) {
        List<JfunctionParamModel> list=new ArrayList<>();
        for (JQuickLangParser.ParamContext paramContext :ctx.param()){
            JfunctionParamModel param=visitParam(paramContext);
            list.add(param);
        }
        return list;
    }
    @Override
    public JfunctionParamModel visitParam(JQuickLangParser.ParamContext ctx) {
        JAssert.notNull(ctx.IDENTIFIER(),"the function parameter name is not support");
        JAssert.isTrue(2==ctx.IDENTIFIER().size(),"the function parameter name and type both require not null");
        String paramType=ctx.IDENTIFIER().get(0).getText();
        String paramName=ctx.IDENTIFIER().get(1).getText();
        JiteralEnums type=JiteralEnums.codeOf(paramType);
        JAssert.notNull(type,"the function parameter type "+paramType+" is not support");
        JAssert.notNull(paramName,"the function parameter name "+paramType+" require not null");
        JfunctionParamModel model=new JfunctionParamModel();
        model.setType(type.getCode());
        model.setName(paramName);
        return model;

    }

    @Override
    public Object visitFunctionCall(JQuickLangParser.FunctionCallContext ctx) {
        JAssert.notNull(ctx.IDENTIFIER(), "functionName must not be null");
        String functionName = ctx.IDENTIFIER().getText();
        List<String> argTypes = new ArrayList<>();
        if (ctx.argumentList() != null) {
            for (JQuickLangParser.LiteralContext arg : ctx.argumentList().literal()) {
                if (arg.string() != null) {
                    argTypes.add(JiteralEnums.string.getCode());
                } else if (arg.number() != null) {
                    argTypes.add(JiteralEnums.number.getCode());
                } else if (arg.date() != null) {
                    argTypes.add(JiteralEnums.date.getCode());
                } else if (arg.variables() != null) {
                    argTypes.add(JiteralEnums.variables.getCode());
                } else if (arg.bool() != null) {
                    argTypes.add(JiteralEnums.bool.getCode());
                }else{
                    JAssert.throwNewException("in valid argument type for "+functionName);
                }
            }
        }
        JFunctionDefinitionModel def = registry.lookupFunction(functionName, argTypes);
        Assert.notNull(def,"function "+functionName+" not found");
        List<Object> paramList=visitArgumentList(ctx.argumentList());
        return null;
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
