package com.sliit.mtit.microservice.complaintservice.dto;

public class ComplaintRequest {

    private String ComplaintType;
    private String CustomerName;
    private String ProductID;
    private String ProductName;
    private String DriverID;
    private String DriverName;
    private String Reason;


    public String getComplaintType() {
        return ComplaintType;
    }

    public void setComplaintType(String complaintType) {
        ComplaintType = complaintType;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

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

    public String getDriverID() {
        return DriverID;
    }

    public void setDriverID(String driverID) {
        DriverID = driverID;
    }

    public String getDriverName() {
        return DriverName;
    }

    public void setDriverName(String driverName) {
        DriverName = driverName;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String reason) {
        Reason = reason;
    }

    @Override
    public String toString() {
        return "ComplaintRequest{" +
                "ComplaintType='" + ComplaintType + '\'' +
                ", CustomerName='" + CustomerName + '\'' +
                ", ProductID='" + ProductID + '\'' +
                ", ProductName='" + ProductName + '\'' +
                ", DriverID='" + DriverID + '\'' +
                ", DriverName='" + DriverName + '\'' +
                ", Reason='" + Reason + '\'' +
                '}';
    }
}
