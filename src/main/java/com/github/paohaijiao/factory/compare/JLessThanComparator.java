package com.github.paohaijiao.factory.compare;

import java.math.BigDecimal;

public class JLessThanComparator  implements JComparator{

    private final BigDecimal threshold;

    public JLessThanComparator(BigDecimal threshold) {
        this.threshold = threshold;
    }

    @Override
    public boolean compare(BigDecimal value) {
        return value.compareTo(threshold) < 0;
    }
}
