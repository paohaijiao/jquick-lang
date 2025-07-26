package com.github.paohaijiao.model;

import java.util.List;

public class JStudent {

    private String name;

    private int value;


    public JStudent() {

    }
    public JStudent(String i,String f,String b) {
        this.name = "haha";
        this.value = value;
    }
    public JStudent(int i,float f,boolean b) {
        this.name = "haha";

        this.value = value;
    }
    public JStudent(String str,int i,boolean b,List<Integer> list) {
        this.name = "haha";

        this.value = value;
    }
    public JStudent(String name) {

        this.name = name;

        this.value = 5;
    }

    public JStudent(String name, int value) {

        this.name = name;

        this.value = value;
    }
    public JStudent(List<Integer> list) {

//        this.name = name;
//
//        this.value = value;
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
