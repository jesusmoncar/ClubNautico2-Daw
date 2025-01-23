package com.clubnautico.clubnautico.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
class GlobalExceptionHandler {
    @ExceptionHandler(NotFound.class)
    public ResponseEntity<String> handleUsernameAlreadyExists(NotFound ex) {        // Retorna el mensaje de la excepción en el cuerpo de la respuesta con el código HTTP 400 (Bad Request)
         return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

}