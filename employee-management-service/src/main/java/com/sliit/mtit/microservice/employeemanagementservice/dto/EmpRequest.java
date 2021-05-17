package com.sliit.mtit.microservice.employeemanagementservice.dto;

public class EmpRequest {

    private String FullName;
    private String Age;
    private String address;
    private String Position;
    private String DrivingLicense;
    private String Contact;

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getDrivingLicense() {
        return DrivingLicense;
    }

    public void setDrivingLicense(String drivingLicense) {
        DrivingLicense = drivingLicense;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "EmpRequest{" +
                "FullName='" + FullName + '\'' +
                ", Age='" + Age + '\'' +
                ", address='" + address + '\'' +
                ", Position='" + Position + '\'' +
                ", DrivingLicense='" + DrivingLicense + '\'' +
                ", Contact='" + Contact + '\'' +
                '}';
    }


}
