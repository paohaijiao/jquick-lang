package com.github.paohaijiao.visitor;


import com.github.paohaijiao.enums.JMathOp;
import com.github.paohaijiao.exception.JAssert;
import com.github.paohaijiao.parser.JQuickLangParser;

import java.math.BigDecimal;

public class JQuickLangMathVisitor extends JQuickLangFunctionCallVisitor {

    @Override
    public Object visitArithmetic(JQuickLangParser.ArithmeticContext ctx) {
        Object result = visit(ctx.primary(0));
        for (int i = 1; i < ctx.primary().size(); i++) {
            String operator = ctx.getChild(2 * i - 1).getText();
            JMathOp op = JMathOp.codeOf(operator);
            JAssert.notNull(op, "Unsupported operator: " + operator);
            Object right = visit(ctx.primary(i));
            switch (operator) {
                case "*":
                    result = multiply(result, right);
                    break;
                case "/":
                    result = divide(result, right);
                    break;
                case "+":
                    result = add(result, right);
                    break;
                case "-":
                    result = subtract(result, right);
                    break;
                default:
                    throw new RuntimeException("Unknown operator: " + operator);
            }
        }
        return result;
    }

    private Object multiply(Object left, Object right) {
        if (left instanceof Number && right instanceof Number) {
            BigDecimal leftBigDecimal  = new BigDecimal(left.toString());
            BigDecimal rightBigDecimal  = new BigDecimal(right.toString());
            BigDecimal result= leftBigDecimal.multiply(rightBigDecimal);
            return convertToPrimaryType(result,left.getClass());
        }
        JAssert.throwNewException("multiplication of non-numeric types");
        return null;
    }
    private Object divide(Object left, Object right) {
        if (left instanceof Number && right instanceof Number) {
            BigDecimal leftBigDecimal  = new BigDecimal(left.toString());
            BigDecimal rightBigDecimal  = new BigDecimal(right.toString());
            BigDecimal result= leftBigDecimal.divide(rightBigDecimal);
            return convertToPrimaryType(result,left.getClass());
        }
        JAssert.throwNewException("division of non-numeric types");
        return null;
    }


    private Object add(Object left, Object right) {
        if (left instanceof Number && right instanceof Number) {
            BigDecimal leftBigDecimal  = new BigDecimal(left.toString());
            BigDecimal rightBigDecimal  = new BigDecimal(right.toString());
            BigDecimal result= leftBigDecimal.add(rightBigDecimal);
            return convertToPrimaryType(result,left.getClass());
        }
        else if (left instanceof String || right instanceof String) {
            return left.toString() + right.toString();
        }
        throw new RuntimeException("Addition of incompatible types: "
                + left.getClass() + " and " + right.getClass());
    }

    private Object subtract(Object left, Object right) {
        if (left instanceof Number && right instanceof Number) {
            BigDecimal leftBigDecimal  = new BigDecimal(left.toString());
            BigDecimal rightBigDecimal  = new BigDecimal(right.toString());
            BigDecimal result= leftBigDecimal.subtract(rightBigDecimal);
            return convertToPrimaryType(result,left.getClass());
        }
        throw new RuntimeException("Subtraction of non-numeric types");
    }

    private Object convertToPrimaryType(BigDecimal value,Class<?>  clazz){
        if(clazz==Short.class||clazz==short.class){
            return value.shortValue();
        }
        if(clazz==Integer.class||clazz==int.class){
            return value.intValue();
        }
        if(clazz==Float.class||clazz==float.class){
            return value.floatValue();
        }
        if(clazz==Double.class||clazz==double.class){
            return value.doubleValue();
        }
        if(clazz==Long.class||clazz==long.class){
            return value.longValue();
        }
        return value;
    }
}
