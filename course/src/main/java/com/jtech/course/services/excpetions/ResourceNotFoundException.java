package com.jtech.course.services.excpetions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(Object id){
        super("Resource not found. ID: " + id);
    }
}
