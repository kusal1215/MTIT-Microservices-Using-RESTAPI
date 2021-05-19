package com.sliit.mtit.microservice.deliverycomplaintservice.dto;

public class DeliveryComplaintResponse {

    private String DelComID;
    private String Message;

    public String getDelComID() {
        return DelComID;
    }

    public void setDelComID(String delComID) {
        DelComID = delComID;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
