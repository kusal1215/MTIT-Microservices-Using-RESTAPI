package com.sliit.mtit.microservice.employeemanagementservice.dto;

public class DriverCreationResponse {


    private String Message;
    private String LoginCreationMessage;

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public String getLoginCreationMessage() {
        return LoginCreationMessage;
    }

    public void setLoginCreationMessage(String loginCreationMessage) {
        LoginCreationMessage = loginCreationMessage;
    }
}
