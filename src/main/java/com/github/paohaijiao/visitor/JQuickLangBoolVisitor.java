package com.github.paohaijiao.visitor;


import com.github.paohaijiao.enums.JMathOp;
import com.github.paohaijiao.exception.JAssert;
import com.github.paohaijiao.factory.JBigDecimalComparatorFactory;
import com.github.paohaijiao.factory.compare.JComparator;
import com.github.paohaijiao.parser.JQuickLangParser;

import java.math.BigDecimal;

public class JQuickLangBoolVisitor extends JQuickLangMathVisitor {



    @Override
    public Object visitComparison(JQuickLangParser.ComparisonContext ctx) {
        JAssert.isTrue(!ctx.primary().isEmpty(),"left expression expected");
        Object left = visit(ctx.primary(0));
        if (ctx.primary().size() == 1) {
            return left;
        }
        for (int i = 1; i < ctx.primary().size(); i++) {
            String operator = ctx.getChild(2 * i - 1).getText();
            JMathOp op = JMathOp.codeOf(operator);
            JAssert.notNull(op, "Unsupported operator: " + operator);
            Object right = visit(ctx.primary(i));
            boolean result;
            switch (operator) {
                case ">":
                    result = compareGreaterThan(left, right);
                    break;
                case ">=":
                    result = compareGreaterThanOrEqual(left, right);
                    break;
                case "<":
                    result = compareLessThan(left, right);
                    break;
                case "<=":
                    result = compareLessThanOrEqual(left, right);
                    break;
                case "==":
                    result = isEqual(left, right);
                    break;
                case "!=":
                    result = !isEqual(left, right);
                    break;
                default:
                    throw new RuntimeException("Unknown comparison operator: " + operator);
            }
            // For chained comparisons (a > b > c), use the right value as new left
            left = result;
        }
        return left;
    }

    @Override
    public Object visitLogical(JQuickLangParser.LogicalContext ctx) {
        JAssert.isTrue(!ctx.comparison().isEmpty(),"left expression expected");
        boolean result = toBoolean(visit(ctx.comparison(0)));
        for (int i = 1; i < ctx.comparison().size(); i++) {
            if (result) {
                return true;
            }
            result = result || toBoolean(visit(ctx.comparison(i)));
        }

        return result;
    }

    private boolean isEqual(Object left, Object right) {
        if (left == null) {
            return right == null;
        }
        if (right == null) {
            return false;
        }
        if (left instanceof Number && right instanceof Number) {
            BigDecimal leftBigDecimal  = new BigDecimal(left.toString());
            BigDecimal rightBigDecimal  = new BigDecimal(right.toString());
            return leftBigDecimal.compareTo(rightBigDecimal) == 0;
        }

        if (left instanceof Boolean && right instanceof Boolean) {
            return ((Boolean) left).booleanValue() == ((Boolean) right).booleanValue();
        }

        if (left instanceof String && right instanceof String) {
            return left.equals(right);
        }
        return left.equals(right);
    }

    private boolean compareGreaterThan(Object left, Object right) {
        if (left instanceof Number && right instanceof Number) {
            BigDecimal leftBigDecimal  = new BigDecimal(left.toString());
            BigDecimal rightBigDecimal  = new BigDecimal(right.toString());
            JComparator comparator=JBigDecimalComparatorFactory.greaterThan(leftBigDecimal);
            return comparator.compare(rightBigDecimal);
        }
        throw new RuntimeException("cannot compare non-numeric values with >");
    }

    private boolean compareGreaterThanOrEqual(Object left, Object right) {
        if (left instanceof Number && right instanceof Number) {
            BigDecimal leftBigDecimal  = new BigDecimal(left.toString());
            BigDecimal rightBigDecimal  = new BigDecimal(right.toString());
            JComparator comparator=JBigDecimalComparatorFactory.greaterThanOrEqual(leftBigDecimal);
            return comparator.compare(rightBigDecimal);
        }
        throw new RuntimeException("cannot compare non-numeric values with >=");
    }

    private boolean compareLessThan(Object left, Object right) {
        if (left instanceof Number && right instanceof Number) {
            BigDecimal leftBigDecimal  = new BigDecimal(left.toString());
            BigDecimal rightBigDecimal  = new BigDecimal(right.toString());
            JComparator comparator=JBigDecimalComparatorFactory.lessThan(leftBigDecimal);
            return comparator.compare(rightBigDecimal);
        }
        throw new RuntimeException("cannot compare non-numeric values with <");
    }

    private boolean compareLessThanOrEqual(Object left, Object right) {
        if (left instanceof Number && right instanceof Number) {
            BigDecimal leftBigDecimal  = new BigDecimal(left.toString());
            BigDecimal rightBigDecimal  = new BigDecimal(right.toString());
            JComparator comparator=JBigDecimalComparatorFactory.lessThanOrEqual(leftBigDecimal);
            return comparator.compare(rightBigDecimal);
        }
        throw new RuntimeException("cannot compare non-numeric values with <=");
    }

}
