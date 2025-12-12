package com.APIweb.course.services.exceptions;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ResourceNotFoundException extends RuntimeException {


    @JsonIgnore
    public ResourceNotFoundException(Object id) {
        super("Resource not found. Id " + id);
    }

}
