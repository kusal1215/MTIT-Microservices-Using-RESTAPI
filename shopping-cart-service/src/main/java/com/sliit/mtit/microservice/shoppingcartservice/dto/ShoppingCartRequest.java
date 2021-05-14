package com.sliit.mtit.microservice.shoppingcartservice.dto;

public class ShoppingCartRequest {

    private String productName;
    private String productQuantity;
    private String productPrice;
    private String productColor;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(String productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    @Override
    public String toString() {
        return "ShoppingCartRequest{" +
                "productName='" + productName + '\'' +
                ", productQuantity='" + productQuantity + '\'' +
                ", productPrice='" + productPrice + '\'' +
                ", productColor='" + productColor + '\'' +
                '}';
    }
}
