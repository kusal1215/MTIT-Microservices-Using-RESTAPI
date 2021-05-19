package com.sliit.mtit.microservice.productcomplaintservice.dto;

public class ProductComplaintRequest {

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

    @Override
    public String toString() {
        return "ProductComplaintRequest{" +
                "ProductID='" + ProductID + '\'' +
                ", ProductName='" + ProductName + '\'' +
                ", Reason='" + Reason + '\'' +
                '}';
    }
}
