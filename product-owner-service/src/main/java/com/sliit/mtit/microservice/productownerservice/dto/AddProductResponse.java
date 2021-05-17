package com.sliit.mtit.microservice.productownerservice.dto;

public class AddProductResponse {

    private String productAddedId;
    private String productId;
    private String message;

    public String getProductAddedId() {
        return productAddedId;
    }

    public void setProductAddedId(String productAddedId) {
        this.productAddedId = productAddedId;
    }

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
