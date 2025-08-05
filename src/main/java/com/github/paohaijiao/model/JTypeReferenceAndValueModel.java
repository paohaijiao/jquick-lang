package com.github.paohaijiao.model;

import com.github.paohaijiao.support.JTypeReference;
import lombok.Data;

@Data
public class JTypeReferenceAndValueModel {

    private  JTypeReference<?>[] typeArguments;

    private  Object[] data;

}
