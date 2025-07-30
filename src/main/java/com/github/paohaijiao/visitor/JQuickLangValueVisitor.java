package com.github.paohaijiao.visitor;

import com.github.paohaijiao.constants.JConstants;
import com.github.paohaijiao.date.JDateUtil;
import com.github.paohaijiao.exception.JAssert;
import com.github.paohaijiao.param.JContext;
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
        }else  if(null!=ctx.date()){
            return visitDate(ctx.date());
        }else  if(null!=ctx.variables()){
            return visitVariables(ctx.variables());
         }else  if(null!=ctx.short_()){
            return visitShort(ctx.short_());
        }else  if(null!=ctx.int_()){
            return visitInt(ctx.int_());
        }else  if(null!=ctx.float_()){
            return visitFloat(ctx.float_());
        }else  if(null!=ctx.double_()){
            return visitDouble(ctx.double_());
        }else  if(null!=ctx.long_()){
            return visitLong(ctx.long_());
        }else  if(null!=ctx.identifier()){
            return visitIdentifier(ctx.identifier());
        }
        else {
            return null;
        }
    }
    @Override
    public Short visitShort(JQuickLangParser.ShortContext ctx) {
        String text = ctx.getText();
        short value = Short.parseShort(text.substring(0, text.length() - 1));
        return Short.valueOf(value);
    }

    @Override
    public Integer visitInt(JQuickLangParser.IntContext ctx) {
        String text = ctx.getText();
        int value = Integer.parseInt(text);
        return  Integer.valueOf(value);
    }

    @Override
    public Float visitFloat(JQuickLangParser.FloatContext ctx) {
        String text = ctx.getText();
        float value = Float.parseFloat(text.substring(0, text.length() - 1));
        return  Float.valueOf(value);
    }

    @Override
    public Double visitDouble(JQuickLangParser.DoubleContext ctx) {
        String text = ctx.getText();
        double value = Double.parseDouble(text.substring(0, text.length() - (text.endsWith("d") ? 1 : 0)));
        return  Double.valueOf(value);
    }

    @Override
    public Long visitLong(JQuickLangParser.LongContext ctx) {
        String text = ctx.getText();
        long value = Long.parseLong(text.substring(0, text.length() - 1));
        return  Long.valueOf(value);
    }
    @Override
    public Object visitIdentifier(JQuickLangParser.IdentifierContext ctx) {
        JContext context=this.context;
        JAssert.notNull(ctx.IDENTIFIER(),"identifier must not be null");
        Object key =ctx.IDENTIFIER().getText();
        if(null==context.get(key)){
            JAssert.throwNewException("Cannot find identifier ["+key+"] in context");
        }
        return context.get(key);
    }

}
