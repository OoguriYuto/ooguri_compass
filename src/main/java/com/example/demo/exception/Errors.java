package com.example.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum Errors {
    INVALID_REQUEST("E0001", "Invalid request.", HttpStatus.BAD_REQUEST),
    DB_ERROR("E0002", "Database error.", HttpStatus.INTERNAL_SERVER_ERROR),
    INTERNAL_SERVER_ERROR("E9999", "Internal server error.", HttpStatus.INTERNAL_SERVER_ERROR);

    private final String code;
    private final String message;
    private final HttpStatus status;

    @Override
    public String toString() {
        return String.format("{\"code\": \"%s\", \"message\": \"%s\", \"status\": \"%d\"}",
            this.code, this.message, this.status.value());
    }
}
