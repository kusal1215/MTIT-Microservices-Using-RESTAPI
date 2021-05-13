package com.sliit.mtit.microservice.customerfeedbackservice.dto;

public class CustomerFeedbackRequest {

    private String fullName;
    private String email;
    private String Address;
    private String age;
    private String productName;
    private String productQuantity;
    private String productPrice;
    private String feedbackMessage;
    private String rating;

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

    public String getFeedbackMessage() {
        return feedbackMessage;
    }

    public void setFeedbackMessage(String feedbackMessage) {
        this.feedbackMessage = feedbackMessage;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "CustomerFeedbackRequest{" +
                "fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", Address='" + Address + '\'' +
                ", age='" + age + '\'' +
                ", productName='" + productName + '\'' +
                ", productQuantity='" + productQuantity + '\'' +
                ", productPrice='" + productPrice + '\'' +
                ", feedbackMessage='" + feedbackMessage + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}
