package com.sliit.mtit.microservice.invoiceservice.dto;

public class InvoiceResponse {

    private String InvoiceID;
    private String Message;

    public String getInvoiceID() {
        return InvoiceID;
    }

    public void setInvoiceID(String invoiceID) {
        InvoiceID = invoiceID;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
