package com.sliit.mtit.microservice.noticemanagerservice.dto;

public class NoticeManagerResponse {

    private String adminId;
    private String noticeManagerId;
    private String message;

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getNoticeManagerId() {
        return noticeManagerId;
    }

    public void setNoticeManagerId(String noticeManagerId) {
        this.noticeManagerId = noticeManagerId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
