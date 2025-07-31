package com.github.paohaijiao.visitor;
import com.github.paohaijiao.exception.JAssert;
import com.github.paohaijiao.exception.JBreakException;
import com.github.paohaijiao.exception.JContinueException;
import com.github.paohaijiao.model.JImportModel;
import com.github.paohaijiao.model.JReturnValueModel;
import com.github.paohaijiao.parser.JQuickLangParser;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class JQuickLangStatementVisitor extends JQuickLangIfStatementVisitor{

    @Override
    public Object visitControlStatement(JQuickLangParser.ControlStatementContext ctx) {
        if (ctx.ifStatement() != null) {
        return  visit(ctx.ifStatement());
        } else if (ctx.forStatement() != null) {
            return visit(ctx.forStatement());
        } else if (ctx.whileStatement() != null) {
            return visit(ctx.whileStatement());
        } else if (ctx.returnStatement() != null) {
            return visit(ctx.returnStatement());
        } else if (ctx.expressionStatement() != null) {
            return visit(ctx.expressionStatement());
        }else if (ctx.breakStatement() != null) {
            return visitBreakStatement(ctx.breakStatement());
        } else if (ctx.continueStatement() != null) {
            return visitContinueStatement(ctx.continueStatement());
        }
        throw new RuntimeException("Unknown control statement");
    }
    @Override
    public Object visitStatement(JQuickLangParser.StatementContext ctx) {
        if(ctx.expression() != null) {
            return visit(ctx.expression());
        } else if (null!=ctx.method()) {
            return visitMethod(ctx.method());
        } else if (null!=ctx.controlStatement()) {
            return visitControlStatement(ctx.controlStatement());
        }else if (null!=ctx.sout()) {
            return visitSout(ctx.sout());
        }
        throw new RuntimeException("Unknown  statement");
    }
    @Override
    public Object visitAccessStaticVariable(JQuickLangParser.AccessStaticVariableContext ctx) {
        JAssert.notNull(ctx.accessClassName(),"can't access  className variable ["+ctx.accessClassName()+"]");
        JAssert.notNull(ctx.accessObjectName(),"can't access static ObjectName variable ["+ctx.accessObjectName()+"]");
        String classNameIdentifier=ctx.accessClassName().getText();
        String staticField=ctx.accessObjectName().getText();
        JAssert.isTrue(this.importContainer.existsIdentify(classNameIdentifier),"can't access className ["+classNameIdentifier+"]");
        JImportModel importModel=this.importContainer.get(classNameIdentifier);
        Class<?> clazz=importModel.getClazz();
        try{
            Field filed= clazz.getField(staticField);
            Object obj=filed.get(null);
            return obj;
        }catch (Exception e){
            e.printStackTrace();
        }

        throw new RuntimeException("Unknown  accessStaticVariable");

    }

    @Override
    public Object visitMethod(JQuickLangParser.MethodContext ctx) {
        if (ctx.functionDefinition() != null) {
            return visit(ctx.functionDefinition());
        } else if (ctx.methodInvocation() != null) {
            return visit(ctx.methodInvocation());
        }
        throw new RuntimeException("Unknown rule type");
    }
    @Override
    public Object visitAction(JQuickLangParser.ActionContext ctx) {
        Object result = null;
        if(ctx.variableDecl()!=null&&!ctx.variableDecl().isEmpty()){
            for (JQuickLangParser.VariableDeclContext stmt : ctx.variableDecl()) {
                result = visit(stmt);
            }
        }
        List<JQuickLangParser.StatementContext> statements = ctx.statement();
        List<JQuickLangParser.ControlStatementContext> controlStatements = ctx.controlStatement();
        for (JQuickLangParser.StatementContext stmt : statements) {
            result = visit(stmt);
        }
        for (JQuickLangParser.ControlStatementContext ctrlStmt : controlStatements) {
            result = visit(ctrlStmt);
            if (result instanceof JReturnValueModel) {
                return result;
            }
        }
        return result;
    }
    @Override
    public Void visitBreakStatement(JQuickLangParser.BreakStatementContext ctx) {
        throw new JBreakException(new ArrayList<>());
    }
    @Override
    public Void visitContinueStatement(JQuickLangParser.ContinueStatementContext ctx) {
        throw new JContinueException(new ArrayList<>());
    }
    @Override
    public Object visitSout(JQuickLangParser.SoutContext ctx) {
        if (ctx.expression() != null) {
            Object object=visitExpression(ctx.expression());
            System.out.println(object);
        }
        return null;
    }


}
