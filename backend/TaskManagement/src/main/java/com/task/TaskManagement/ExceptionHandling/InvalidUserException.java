package com.task.TaskManagement.ExceptionHandling;

public class InvalidUserException extends RuntimeException {
    public InvalidUserException(String message) {
        super(message);
    }
}

