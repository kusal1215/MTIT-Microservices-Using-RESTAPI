package com.sliit.mtit.microservice.paymentservice.dto;

public class PaymentRequest {

    private String OrderID;
    private String CustomerID;
    private String CustomerName;
    private String Contact;
    private String ProdID;
    private String ProdName;
    private String ProdQty;
    private String TotPrice;


    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String orderID) {
        OrderID = orderID;
    }

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

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    public String getProdID() {
        return ProdID;
    }

    public void setProdID(String prodID) {
        ProdID = prodID;
    }

    public String getProdName() {
        return ProdName;
    }

    public void setProdName(String prodName) {
        ProdName = prodName;
    }

    public String getProdQty() {
        return ProdQty;
    }

    public void setProdQty(String prodQty) {
        ProdQty = prodQty;
    }

    public String getTotPrice() {
        return TotPrice;
    }

    public void setTotPrice(String totPrice) {
        TotPrice = totPrice;
    }

    @Override
    public String toString() {
        return "PaymentRequest{" +
                "OrderID='" + OrderID + '\'' +
                ", CustomerID='" + CustomerID + '\'' +
                ", CustomerName='" + CustomerName + '\'' +
                ", Contact='" + Contact + '\'' +
                ", ProdID='" + ProdID + '\'' +
                ", ProdName='" + ProdName + '\'' +
                ", ProdQty='" + ProdQty + '\'' +
                ", TotPrice='" + TotPrice + '\'' +
                '}';
    }
}
