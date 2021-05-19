package com.sliit.mtit.microservice.complaintservice.dto;

public class ProdComplaintCreationResponse {

    private String ProdComID;
    private String Message;

    public String getProdComID() {
        return ProdComID;
    }

    public void setProdComID(String prodComID) {
        ProdComID = prodComID;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
