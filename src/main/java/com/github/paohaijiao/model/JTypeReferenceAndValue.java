package com.github.paohaijiao.model;

import com.github.paohaijiao.support.JTypeReference;
import lombok.Data;

@Data
public class JTypeReferenceAndValue {

    private  JTypeReference<?> typeArguments;

    private  Object data;
}
