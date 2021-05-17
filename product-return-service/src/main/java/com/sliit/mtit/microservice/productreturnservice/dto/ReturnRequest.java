package com.sliit.mtit.microservice.productreturnservice.dto;

public class ReturnRequest {

    private String CustomerID;
    private String CustomerName;
    private String ProductID;
    private String ProductName;
    private String AccountNumber;
    private String price;


    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String customerID) {
        CustomerID = customerID;
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

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ReturnRequest{" +
                "CustomerID='" + CustomerID + '\'' +
                ", CustomerName='" + CustomerName + '\'' +
                ", ProductID='" + ProductID + '\'' +
                ", ProductName='" + ProductName + '\'' +
                ", AccountNumber='" + AccountNumber + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
