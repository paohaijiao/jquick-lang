package com.github.paohaijiao.visitor;
import com.github.paohaijiao.exception.JAssert;
import com.github.paohaijiao.model.JFunctionDefinitionModel;
import com.github.paohaijiao.model.JFunctionFieldModel;
import com.github.paohaijiao.model.JfunctionParamModel;
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
            model.setClazz(param.getType());
            list.add(model);
        }
        return list;
    }
    @Override
    public JfunctionParamModel visitParam(JQuickLangParser.ParamContext ctx) {
        JAssert.notNull(ctx.paramType(),"the function parameter type  not null");
        Class<?> type=visitParamType(ctx.paramType());
        String paramName=visitFunctionVar(ctx.functionVar());
        JfunctionParamModel model=new JfunctionParamModel();
        model.setType(type);
        model.setName(paramName);
        return model;

    }



    @Override
    public List<Object> visitArgumentList(JQuickLangParser.ArgumentListContext ctx) {
        List<Object> list = new ArrayList<>();
        if (null != ctx.literal() && !ctx.literal().isEmpty()) {
            for (JQuickLangParser.LiteralContext literalContext : ctx.literal()) {
                Object object = visitLiteral(literalContext);
                list.add(object);
            }
        }
        return list;
    }
    @Override
    public Object visitStandardCall(JQuickLangParser.StandardCallContext ctx) {
        JAssert.notNull(ctx.qualifiedName(),"the class name is not support");
        JAssert.notNull(ctx.methodName(),"the method name is not support");
        String qualifiedName = ctx.qualifiedName() != null ? ctx.qualifiedName().getText() : null;
        String methodName = visitMethodName(ctx.methodName());
        try {
            List<Object> args = new ArrayList<>();
            if(null!=ctx.argumentList()&&null!=ctx.argumentList().literal()&&ctx.argumentList().literal().size()>0){
                args=visitArgumentList(ctx.argumentList());
            }
            return  JObjectFactory.createByStaticMethod(qualifiedName, methodName, args);
        } catch (Exception e) {
            throw new RuntimeException("please double check static method invocation : " + methodName, e);
        }
    }
    @Override
    public Object visitConstructorCall(JQuickLangParser.ConstructorCallContext ctx) {
        try {
            String className = ctx.qualifiedName().getText();
            List<Object> args = new ArrayList<>();
            if(null!=ctx.argumentList()&&null!=ctx.argumentList().literal()&&ctx.argumentList().literal().size()>0){
                args=visitArgumentList(ctx.argumentList());
            }
            return JObjectFactory.createByConstructor(className, args);
        } catch (Exception e) {
            throw new RuntimeException("constructor invocation failed: " + ctx.getText(), e);
        }
    }
    @Override
    public Object visitInstanceMethodCall(JQuickLangParser.InstanceMethodCallContext ctx) {
        try {
            Object target=null;
            if (ctx.instanceName() != null) {
                target = resolveVariable(ctx.instanceName().getText());
            }
            String methodName = visitMethodName(ctx.methodName());
            List<Object> args = new ArrayList<>();
            if(null!=ctx.argumentList()&&null!=ctx.argumentList().literal()&&ctx.argumentList().literal().size()>0){
                args=visitArgumentList(ctx.argumentList());
            }
            return  JObjectFactory.createByInstanceMethod(target, methodName, args);
        } catch (Exception e) {
            throw new RuntimeException("Instance method invocation failed: " + ctx.getText(), e);
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
    public Class<?> visitParamType(JQuickLangParser.ParamTypeContext ctx) {
        if(ctx.TYPESHORT()!=null){
            return short.class;
        }else if(ctx.TYPEINT()!=null){
            return int.class;
        } else if (ctx.TYPEFLOAT()!=null) {
            return float.class;
        }else if (ctx.TYPEDOUBLE()!=null){
            return double.class;
        }else if (ctx.TYPELONG()!=null){
            return long.class;
        }else if (ctx.TYPEBOOLEAN()!=null){
            return boolean.class;
        }else{
            try {
               return  Class.forName(ctx.qualifiedName().getText());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                return null;
            }
        }
    }
    @Override
    public String visitFunctionVar(JQuickLangParser.FunctionVarContext ctx) {
        return ctx.IDENTIFIER().getText();
    }


}
