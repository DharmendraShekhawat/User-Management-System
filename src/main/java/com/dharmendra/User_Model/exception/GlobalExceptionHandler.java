package com.dharmendra.User_Model.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public String handleValidationErrors(UserNotFoundException ex){
        return ex.getMessage();
    }
    }

