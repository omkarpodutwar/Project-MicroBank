package com.eazybytes.accounts.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
//whenever exception is thrown, client gets response for bad req(400)
public class CustomerAlreadyExistsException extends RuntimeException{
    //since we want to write our own exception, we extend the class runtime excwption.

    public CustomerAlreadyExistsException(String message){
        super(message);
    }
}
