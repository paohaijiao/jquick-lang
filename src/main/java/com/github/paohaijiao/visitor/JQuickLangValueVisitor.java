package com.github.paohaijiao.visitor;

import com.github.paohaijiao.constants.JConstants;
import com.github.paohaijiao.core.JQuickLangCoreVisitor;
import com.github.paohaijiao.date.JDateUtil;
import com.github.paohaijiao.parser.JQuickLangParser;
import com.github.paohaijiao.util.JStringUtils;

import java.util.Date;


public class JQuickLangValueVisitor extends JQuickLangCoreVisitor {
    @Override
    public String visitVariables(JQuickLangParser.VariablesContext ctx) {
        String var = ctx.IDENTIFIER().getText();
        return var;
    }

    @Override
    public Date visitDate(JQuickLangParser.DateContext ctx) {
        if (null != ctx.DATE()) {
            String dateString = ctx.DATE().getText();
            Date date = JDateUtil.parse(JDateUtil.getSimpleDateFormat(JConstants.date), dateString);
            return date;
        } else if (null != ctx.DATETIME()) {
            String dateString = ctx.DATETIME().getText();
            Date date = JDateUtil.parse(JDateUtil.getSimpleDateFormat(JConstants.dateTime), dateString);
            return date;
        }
        throw new RuntimeException("Invalid date format: " + ctx.getText());
    }

    @Override
    public String visitString(JQuickLangParser.StringContext ctx) {
        if (ctx.STRING() != null) {
            String text = ctx.STRING().getText();
            String str = JStringUtils.trim(text);
            return str;
        }
        throw new RuntimeException("Invalid string: " + ctx.getText());
    }

    @Override
    public Object visitNumber(JQuickLangParser.NumberContext ctx) {
        if (ctx.NUMBER() != null) {
            String numText = ctx.NUMBER().getText();
            if (numText.contains(".")) {
                return Double.parseDouble(numText);
            } else {
                return Integer.parseInt(numText);
            }
        }
        throw new RuntimeException("Unsupported number format: " + ctx.getText());
    }

    @Override
    public Boolean visitBool(JQuickLangParser.BoolContext ctx) {
        if (ctx.TRUE() != null) {
            return true;
        } else if (ctx.FALSE() != null) {
            return false;
        }
        throw new RuntimeException("Unsupported Boolean format: " + ctx.getText());
    }

}
