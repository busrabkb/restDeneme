package com.restDeneme.restDeneme;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class userNotFoundException extends RuntimeException {

    //Ex message
    public userNotFoundException(String message) {
        super(message);
    }
}
