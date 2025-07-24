package com.github.paohaijiao.model;

public class JStudent {

    private String name;

    private int value;


    public JStudent() {
    }

    public JStudent(String name, int value) {

        this.name = name;

        this.value = value;
    }

    public static JStudent create(String name, int value) {
        return new JStudent(name, value);
    }

    public JStudent copyWithPrefix(String prefix) {
        return new JStudent(prefix + this.name, this.value);
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
