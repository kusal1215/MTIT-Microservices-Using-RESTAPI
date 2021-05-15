package com.sliit.mtit.microservice.adminservice.dto;

public class AdminResponse {

    private String adminId;
    private String message;

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
