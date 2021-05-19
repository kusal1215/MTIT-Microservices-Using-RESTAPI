package com.sliit.mtit.microservice.complaintservice.dto;

public class ComplaintResponse {

    private String ComplaintID;
    private String DelComID;
    private String ProdComID;
    private String Message;


    public String getComplaintID() {
        return ComplaintID;
    }

    public void setComplaintID(String complaintID) {
        ComplaintID = complaintID;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public String getDelComID() {
        return DelComID;
    }

    public void setDelComID(String delComID) {
        DelComID = delComID;
    }

    public String getProdComID() {
        return ProdComID;
    }

    public void setProdComID(String prodComID) {
        ProdComID = prodComID;
    }
}
