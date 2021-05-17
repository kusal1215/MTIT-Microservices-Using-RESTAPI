package com.sliit.mtit.microservice.noticemanagerservice.dto;

public class AddNoticeResponse {

    private String noticedId;
    private String customerId;
    private String message;

    public String getNoticedId() {
        return noticedId;
    }

    public void setNoticedId(String noticedId) {
        this.noticedId = noticedId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
