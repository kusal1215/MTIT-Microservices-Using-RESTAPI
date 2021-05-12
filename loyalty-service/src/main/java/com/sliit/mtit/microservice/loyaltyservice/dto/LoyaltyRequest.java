package com.sliit.mtit.microservice.loyaltyservice.dto;

public class LoyaltyRequest {

    private String fullName;
    private String email;
    private String Address;
    private String age;
    private String loyaltyType;

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

    public String getLoyaltyType() {
        return loyaltyType;
    }

    public void setLoyaltyType(String loyaltyType) {
        this.loyaltyType = loyaltyType;
    }

    @Override
    public String toString() {
        return "LoyaltyRequest{" +
                "fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", Address='" + Address + '\'' +
                ", age='" + age + '\'' +
                ", loyaltyType='" + loyaltyType + '\'' +
                '}';
    }
}
