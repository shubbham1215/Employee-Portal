package com.employeeportal;

public class ForbiddenException extends  Exception{
    public ForbiddenException(String message) {
        super(message);
    }
}
