package com.github.paohaijiao.visitor;
import com.github.paohaijiao.exception.JBreakException;
import com.github.paohaijiao.exception.JContinueException;
import com.github.paohaijiao.parser.JQuickLangParser;

public class JQuickLangForStatementVisitor  extends JQuickLangWhileStatementVisitor {

    @Override
    public Object visitForStatement(JQuickLangParser.ForStatementContext ctx) {
        if (ctx.variableDecl() != null) {
            visit(ctx.variableDecl());
        } else if (ctx.expression(0) != null) {
            visit(ctx.expression(0));
        }
        Object result = null;
        while (ctx.expression(1) == null || toBoolean(visit(ctx.expression(1)))) {
            try {
                result = visit(ctx.action());
            } catch (JBreakException e) {
                break;
            } catch (JContinueException e) {
                continue;
            }
            if (ctx.expression(2) != null) {
                visit(ctx.expression(2));
            }
        }

        return result;
    }

}
