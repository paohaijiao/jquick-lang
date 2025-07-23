package com.github.paohaijiao.enums;

import lombok.Getter;

@Getter
public enum JMathOp {

    mutiply("*", "mutiply"),
    divide("/", "divide"),
    subtract("-", "subtract"),
    greater(">", "greater"),
    greaterEq(">=", "greaterEq"),
    less("<", "less"),
    lessEq("<=", "lessEq"),
    add("+", "add"),
    mod("mod", "mod"),
    pow("pow", "pow"),
    notEqual("!=", "not equal"),
    equal("==", "equal");

    private String code;

    private String value;

    private JMathOp(String code, String value) {
        this.code = code;
        this.value = value;
    }
    public JMathOp codeOf(String code) {
        for (JMathOp op : JMathOp.values()) {
            if (op.code.equals(code)) {
                return op;
            }
        }
        return null;
    }
}
