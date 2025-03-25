package com.example.demo.exception;

import lombok.Getter;

@Getter
public class ApplicationException extends RuntimeException {
    private final Errors error;

    public ApplicationException(Errors error) {
        this.error = error;
    }
}
