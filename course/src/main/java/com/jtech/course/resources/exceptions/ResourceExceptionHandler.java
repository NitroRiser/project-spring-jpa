package com.jtech.course.resources.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.jtech.course.services.excpetions.DatabaseException;
import com.jtech.course.services.excpetions.ResourceNotFoundException;

@ControllerAdvice //Intercepta exceptions
public class ResourceExceptionHandler{
    
    @ExceptionHandler(ResourceNotFoundException.class)//Inteceptando exception ResourceNotFoundException
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request) {
        String error = "Resource not found."; 
        HttpStatus status = HttpStatus.NOT_FOUND; // 404
        StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());//StandardError obj
        return ResponseEntity.status(status).body(err);
    }

    @ExceptionHandler(DatabaseException.class)//Inteceptando exception DatabaseException
    public ResponseEntity<StandardError> database(DatabaseException e, HttpServletRequest request) {
        String error = "Database error."; 
        HttpStatus status = HttpStatus.BAD_REQUEST; // 404
        StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());//StandardError obj
        return ResponseEntity.status(status).body(err);
    }
}
