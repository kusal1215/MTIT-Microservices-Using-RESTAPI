package com.sliit.mtit.microservice.productreturnservice.dto;

public class ReturnResponse {

    private String ProductReturnID;
    private String RefundID;
    private String Message;


    public String getProductReturnID() {
        return ProductReturnID;
    }

    public void setProductReturnID(String productReturnID) {
        ProductReturnID = productReturnID;
    }

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
