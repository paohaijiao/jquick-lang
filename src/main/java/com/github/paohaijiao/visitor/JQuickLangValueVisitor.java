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

import com.github.paohaijiao.constants.JConstants;
import com.github.paohaijiao.date.JDateUtil;
import com.github.paohaijiao.enums.JLiteralEnums;
import com.github.paohaijiao.enums.JLogLevel;
import com.github.paohaijiao.exception.JAssert;
import com.github.paohaijiao.model.JLiteralModel;
import com.github.paohaijiao.parser.JQuickLangParser;
import com.github.paohaijiao.util.JStringUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class JQuickLangValueVisitor extends JQuickLangImportVisitor {
    @Override
    public JLiteralModel visitVariables(JQuickLangParser.VariablesContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        Object value= this.context.get(identifier);
        JAssert.isTrue(value instanceof JLiteralModel,"value must be a literal");
        return (JLiteralModel)value;
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
    public JLiteralModel visitLiteral(JQuickLangParser.LiteralContext ctx) {
        JLiteralModel model = new JLiteralModel();
        model.setLiteral(ctx.getText());
        if(null!=ctx.bool()){
            model.setValue(visitBool(ctx.bool()));
            model.setType(JLiteralEnums.Boolean);
            return model;
        }else  if(null!=ctx.string()){
            model.setValue(visitString(ctx.string()));
            model.setType(JLiteralEnums.String);
            return model;
        }else  if(null!=ctx.date()){
            model.setValue(visitDate(ctx.date()));
            model.setType(JLiteralEnums.Date);
            return model;
        }else  if(null!=ctx.variables()){
            JLiteralModel identifier=visitVariables(ctx.variables());
            model.setValue(identifier.getValue());
            model.setLiteral(ctx.variables().getText());
            model.setType(JLiteralEnums.Variable);
            return model;
         }else  if(null!=ctx.short_()){
            model.setValue(visitShort(ctx.short_()));
            model.setType(JLiteralEnums.Short);
            return model;
        }else  if(null!=ctx.int_()){
            model.setValue(visitInt(ctx.int_()));
            model.setType(JLiteralEnums.Int);
            return model;
        }else  if(null!=ctx.float_()){
            model.setValue(visitFloat(ctx.float_()));
            model.setType(JLiteralEnums.Float);
            return model;
        }else  if(null!=ctx.double_()){
            model.setValue(visitDouble(ctx.double_()));
            model.setType(JLiteralEnums.Double);
            return model;
        }else  if(null!=ctx.long_()){
            model.setValue(visitLong(ctx.long_()));
            model.setType(JLiteralEnums.Long);
            return model;
        }else  if(null!=ctx.identifier()){
            model.setLiteral(ctx.identifier().getText());
            model.setType(JLiteralEnums.Identifier);
            return model;
        }else  if(null!=ctx.listLiteral()){
            model.setType(JLiteralEnums.List);
            model.setLiteral(ctx.listLiteral().getText());
            return model;
        } else  if(null!=ctx.mapLiteral()){
            model.setType(JLiteralEnums.Map);
            model.setLiteral(ctx.mapLiteral().getText());
            return model;
        } else  if(null!=ctx.setLiteral()){
            model.setType(JLiteralEnums.Set);
            model.setLiteral(ctx.setLiteral().getText());
            return model;
        }
        else if(ctx.qualifiedName() != null) {
            try {
                Class<?> clazz = Class.forName(ctx.qualifiedName().getText());
                model.setValue(clazz);
                model.setType(JLiteralEnums.ClassLiteral);
                return model;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }else if (null!=ctx.null_()){
            model.setValue(null);
            model.setLiteral(ctx.null_().getText());
            model.setType(JLiteralEnums.Null);
            return model;
        }
        JAssert.throwNewException("invalid literalsyntax:"+ctx.getText());
        return null;
    }
    @Override
    public Map<Object,Object> visitMapLiteral(JQuickLangParser.MapLiteralContext ctx) {
        Map<Object,Object> map=new HashMap<>();
        for (int i = 0; i < ctx.mapEntry().size(); i++) {
            Map<Object,Object> entry=visitMapEntry(ctx.mapEntry(i));
            map.putAll(entry);
        }
        return map;
    }
    @Override
    public Map<Object,Object> visitMapEntry(JQuickLangParser.MapEntryContext ctx) {
        Map<Object,Object> map=new HashMap<>();
        if(ctx.expression() != null&&ctx.expression().size()==2) {
            Object key=visitExpression(ctx.expression().get(0));
            Object value=visitExpression(ctx.expression().get(1));
            map.put(key,value);
        }
        JAssert.throwNewException("invalidat the map entry");
        return map;
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
    public JLiteralModel visitIdentifier(JQuickLangParser.IdentifierContext ctx) {
//        String varName = ctx.getText();
//        JQuickLangParser.Variable var = parser.lookupVariable(varName);
//        if (var == null) {
//           return  (JLiteralModel)this.context.get(varName);
//        }
//        return convert(var.value, ctx.getText());
        return null;
    }

}
