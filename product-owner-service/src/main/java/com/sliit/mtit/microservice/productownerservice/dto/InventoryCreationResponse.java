package com.sliit.mtit.microservice.productownerservice.dto;

public class InventoryCreationResponse {

    private String productId;
    private String message;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
