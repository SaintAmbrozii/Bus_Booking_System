package com.example.busbooking.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONTINUE)
public class TimeOverException extends RuntimeException{
    public TimeOverException(String message) {
        super(message);
    }
}
