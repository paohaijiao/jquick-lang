package com.github.paohaijiao.factory.compare;

import java.math.BigDecimal;

public class JGreaterThanComparator implements JComparator{
    private final BigDecimal threshold;

    public JGreaterThanComparator(BigDecimal threshold) {
        this.threshold = threshold;
    }

    @Override
    public boolean compare(BigDecimal value) {
        return value.compareTo(threshold) > 0;
    }
}
