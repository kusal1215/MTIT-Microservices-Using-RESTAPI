package com.sliit.mtit.microservice.employeemanagementservice.dto;

public class EmpResponse {

    private String EmpID;
    private String ProfileCreationMessage;
    private String LoginCreationMessage;
    private String Message;

    public String getEmpID() {
        return EmpID;
    }

    public void setEmpID(String empID) {
        EmpID = empID;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public String getProfileCreationMessage() {
        return ProfileCreationMessage;
    }

    public void setProfileCreationMessage(String profileCreationMessage) {
        ProfileCreationMessage = profileCreationMessage;
    }

    public String getLoginCreationMessage() {
        return LoginCreationMessage;
    }

    public void setLoginCreationMessage(String loginCreationMessage) {
        LoginCreationMessage = loginCreationMessage;
    }
}
