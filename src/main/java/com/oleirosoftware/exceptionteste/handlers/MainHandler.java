package com.oleirosoftware.exceptionteste.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.oleirosoftware.exceptionteste.exception.CheckedException;
import com.oleirosoftware.exceptionteste.exception.UncheckedException;
import com.oleirosoftware.exceptionteste.model.ErrorObj;

@ControllerAdvice
public class MainHandler {

    @ExceptionHandler(CheckedException.class)
    public ResponseEntity<?> handlerCheckedException(CheckedException ex) {

        ErrorObj errorObj = new ErrorObj();
        errorObj.setMsg(ex.getMessage());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorObj);
    }

    @ExceptionHandler(UncheckedException.class)
    public ResponseEntity<?> handlerUncheckedException(UncheckedException ex) {

        ErrorObj errorObj = new ErrorObj();
        errorObj.setMsg(ex.getMessage());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorObj);
    }
}
