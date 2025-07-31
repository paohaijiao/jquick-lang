package com.github.paohaijiao.exception;

import java.util.List;

public class JContinueException extends JAntlrExecutionException{
    public JContinueException(List<JAntlrError> errors) {
        super(errors);
    }
}
