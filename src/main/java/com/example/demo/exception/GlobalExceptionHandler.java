package com.example.demo.exception;

import com.example.demo.model.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(InvalidCPFException.class)
    public ResponseEntity<ApiDetails> handlerInvalidCPF(InvalidCPFException ex){
        Map<String, ApiResponse> response = new HashMap<>();
        ApiDetails details = new ApiDetails("CPF inválido", ex.getMessage(), HttpStatus.BAD_REQUEST.value(),
                false,LocalDateTime.now());

        return new ResponseEntity<>(details, HttpStatus.BAD_REQUEST);
    }
}
