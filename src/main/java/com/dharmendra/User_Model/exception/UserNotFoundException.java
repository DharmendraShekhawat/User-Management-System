package com.dharmendra.User_Model.exception;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException() {
        super();
    }

    public UserNotFoundException(String str) {
        super(str);
    }
}