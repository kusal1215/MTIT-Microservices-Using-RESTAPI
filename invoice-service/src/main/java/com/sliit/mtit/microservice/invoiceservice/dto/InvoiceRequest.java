package com.sliit.mtit.microservice.invoiceservice.dto;

public class InvoiceRequest {

    private String OrderID;
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
        return "InvoiceRequest{" +
                "OrderID='" + OrderID + '\'' +
                ", CustomerName='" + CustomerName + '\'' +
                ", Contact='" + Contact + '\'' +
                ", ProdID='" + ProdID + '\'' +
                ", ProdName='" + ProdName + '\'' +
                ", ProdQty='" + ProdQty + '\'' +
                ", TotPrice='" + TotPrice + '\'' +
                '}';
    }
}
