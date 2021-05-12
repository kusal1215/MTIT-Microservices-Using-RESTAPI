package com.sliit.mtit.microservice.orderservice.dto;

public class OrderRequest {

    private String productName;
    private String productPrice;
    private String fullName;
    private String email;
    private String Address;
    private String age;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "productName='" + productName + '\'' +
                ", productPrice='" + productPrice + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", Address='" + Address + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
