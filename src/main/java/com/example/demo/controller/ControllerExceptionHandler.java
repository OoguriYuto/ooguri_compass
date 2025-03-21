package com.example.demo.controller;

import com.example.demo.exception.ApplicationException;
import com.example.demo.exception.Errors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler({ Exception.class })
    public Errors unhandledException(Exception ex) {
        log.error("Unhandled Exception.", ex);
        return Errors.INTERNAL_SERVER_ERROR;
    }

    @ExceptionHandler({ ApplicationException.class })
    public Errors handleApplicationException(ApplicationException ex) {
        log.warn("Application exception. " + ex.getError().toString());
        return ex.getError();
    }
}
