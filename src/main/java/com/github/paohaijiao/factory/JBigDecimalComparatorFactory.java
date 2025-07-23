package com.github.paohaijiao.factory;

import com.github.paohaijiao.factory.compare.*;

import java.math.BigDecimal;

public class JBigDecimalComparatorFactory {

    private JBigDecimalComparatorFactory() {}

    public static JComparator greaterThan(BigDecimal threshold) {
        return new JGreaterThanComparator(threshold);
    }
    public static JComparator greaterThanOrEqual(BigDecimal threshold) {
        return new JGreaterThanOrEqualComparator(threshold);
    }

    public static JComparator lessThan(BigDecimal threshold) {
        return new JLessThanComparator(threshold);
    }
    public static JComparator lessThanOrEqual(BigDecimal threshold) {
        return new JLessThanOrEqualComparator(threshold);
    }

}
