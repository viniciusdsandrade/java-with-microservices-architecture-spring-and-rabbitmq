package com.restful.rabbitmq.exception;

import org.springframework.validation.FieldError;

import java.time.LocalDateTime;

public record ErrorDetails(
        LocalDateTime timestamp,
        String field,
        String details,
        String error) {

    public ErrorDetails(FieldError erro) {
        this(
                LocalDateTime.now(),
                erro.getField(),
                erro.getDefaultMessage(),
                "Code: " + erro.getCode()
        );
    }
}
