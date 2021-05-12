package com.sliit.mtit.microservice.customerservice.dto;

public class CustomerRequest {

    private String fullName;
    private String email;
    private String Address;
    private String age;

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
        return "CustomerRequest{" +
                "fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", Address='" + Address + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
