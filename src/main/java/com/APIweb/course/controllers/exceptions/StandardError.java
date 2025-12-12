package com.APIweb.course.controllers.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.StandardException;

import java.io.Serializable;
import java.time.Instant;

@AllArgsConstructor
@Getter
@Setter
public class StandardError implements Serializable {

    private Instant timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;


}
