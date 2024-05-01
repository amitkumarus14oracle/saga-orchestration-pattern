package com.restart.exception;

public class WorkflowException extends RuntimeException{
    public WorkflowException() {
    }

    public WorkflowException(String message) {
        super(message);
    }
}
