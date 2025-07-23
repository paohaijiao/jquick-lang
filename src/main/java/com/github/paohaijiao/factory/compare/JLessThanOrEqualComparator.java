package com.github.paohaijiao.factory.compare;

import java.math.BigDecimal;

public class JLessThanOrEqualComparator  implements JComparator {


    private final BigDecimal threshold;

    public JLessThanOrEqualComparator(BigDecimal threshold) {
        this.threshold = threshold;
    }

    @Override
    public boolean compare(BigDecimal value) {
        return value.compareTo(threshold) <= 0;
    }
}
