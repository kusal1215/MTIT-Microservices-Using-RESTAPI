package com.sliit.mtit.microservice.noticemanagerservice.dto;

public class AddNoticeRequest {

    private String fullName;
    private String email;
    private String Address;
    private String age;
    private String Notice;

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

    public String getNotice() {
        return Notice;
    }

    public void setNotice(String notice) {
        Notice = notice;
    }

    @Override
    public String toString() {
        return "AddNoticeRequest{" +
                "fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", Address='" + Address + '\'' +
                ", age='" + age + '\'' +
                ", Notice='" + Notice + '\'' +
                '}';
    }
}
