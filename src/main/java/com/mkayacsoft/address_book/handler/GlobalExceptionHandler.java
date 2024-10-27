package com.mkayacsoft.address_book.handler;

import com.mkayacsoft.address_book.exception.BaseException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {BaseException.class})
    public ResponseEntity<String> handleBaseException(BaseException baseException){
        return ResponseEntity.badRequest().body(baseException.getMessage());
    }
}
