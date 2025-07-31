package com.github.paohaijiao.exception;

import java.util.List;

public class JBreakException extends JAntlrExecutionException{
    public JBreakException(List<JAntlrError> errors) {
        super(errors);
    }
}
