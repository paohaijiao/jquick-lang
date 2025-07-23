package com.github.paohaijiao.visitor;

import com.github.paohaijiao.constants.JConstants;
import com.github.paohaijiao.date.JDateUtil;
import com.github.paohaijiao.parser.JQuickLangParser;
import com.github.paohaijiao.util.JStringUtils;

import java.math.BigDecimal;
import java.util.Date;


public class JQuickLangValueVisitor extends JQuickLangImportVisitor {
    @Override
    public Object visitVariables(JQuickLangParser.VariablesContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        Object value= this.context.get(identifier);
        return value;
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
            return new BigDecimal(numText);
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
    @Override
    public Object visitLiteral(JQuickLangParser.LiteralContext ctx) {
        if(null!=ctx.bool()){
            return visitBool(ctx.bool());
        }else  if(null!=ctx.string()){
            return visitString(ctx.string());
        }else  if(null!=ctx.number()){
            return visitNumber(ctx.number());
        }else  if(null!=ctx.date()){
            return visitDate(ctx.date());
        }else  if(null!=ctx.variables()){
            return visitVariables(ctx.variables());
         }else {
            return null;
        }
    }

}
