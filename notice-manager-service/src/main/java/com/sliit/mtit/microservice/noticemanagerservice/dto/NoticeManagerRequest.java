package com.sliit.mtit.microservice.noticemanagerservice.dto;

public class NoticeManagerRequest {

    private String adminName;
    private String adminEmail;
    private String managerName;
    private String managerEmail;

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerEmail() {
        return managerEmail;
    }

    public void setManagerEmail(String managerEmail) {
        this.managerEmail = managerEmail;
    }

    @Override
    public String toString() {
        return "NoticeManagerRequest{" +
                "adminName='" + adminName + '\'' +
                ", adminEmail='" + adminEmail + '\'' +
                ", managerName='" + managerName + '\'' +
                ", managerEmail='" + managerEmail + '\'' +
                '}';
    }
}
