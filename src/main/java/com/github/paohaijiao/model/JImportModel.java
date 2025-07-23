package com.github.paohaijiao.model;

import lombok.Data;

@Data
public class JImportModel {

    private String className;

    private String fullPath;

    private Class<?> clazz;
}
