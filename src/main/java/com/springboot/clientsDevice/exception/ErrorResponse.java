package com.springboot.clientsDevice.exception;


import org.springframework.http.HttpStatus;

public class ErrorResponse {
    public ErrorResponse(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    private HttpStatus status;
    private String message;

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
