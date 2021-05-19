package com.sliit.mtit.microservice.productreturnservice.dto;

public class RefundCreationResponse {

    private String RefundID;
    private String Message;

    public String getRefundID() {
        return RefundID;
    }

    public void setRefundID(String refundID) {
        RefundID = refundID;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
