package com.github.paohaijiao.model;

import com.github.paohaijiao.enums.JLiteralEnums;
import lombok.Data;

@Data
public class JLiteralModel {

    private Object value;

    private String literal;

    private JLiteralEnums type;


}
