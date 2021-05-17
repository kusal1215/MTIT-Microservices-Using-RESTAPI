package com.sliit.mtit.microservice.complaintservice.dto;

public class ProdComplaintCreationRequest {

    private String ProductID;
    private String ProductName;
    private String Reason;

    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String productID) {
        ProductID = productID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String reason) {
        Reason = reason;
    }
}
