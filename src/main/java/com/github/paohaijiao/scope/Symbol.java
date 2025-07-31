package com.github.paohaijiao.scope;

import lombok.Data;

import java.lang.reflect.Type;

@Data
public class Symbol {

    protected String name;

    protected Type type;

    public Symbol(String name, Type type) {
        this.name = name;
        this.type = type;
    }
}
