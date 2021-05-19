package com.sliit.mtit.microservice.productreturnservice.dto;

public class RefundCreationRequest {

    private String CustomerID;
    private String CustomerName;
    private String AccountNumber;
    private String TotPrice;

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

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getTotPrice() {
        return TotPrice;
    }

    public void setTotPrice(String totPrice) {
        TotPrice = totPrice;
    }
}
