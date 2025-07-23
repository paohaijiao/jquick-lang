package com.github.paohaijiao.model;

import lombok.Data;

@Data
public class JReturnValueModel {

    private final Object value;

    public JReturnValueModel(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
}
