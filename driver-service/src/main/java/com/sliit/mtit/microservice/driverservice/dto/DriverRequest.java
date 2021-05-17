package com.sliit.mtit.microservice.driverservice.dto;

public class DriverRequest {

    private String FullName;
    private String Age;
    private String Address;
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
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
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

    @Override
    public String toString() {
        return "DriverRequest{" +
                "FullName='" + FullName + '\'' +
                ", Age='" + Age + '\'' +
                ", Address='" + Address + '\'' +
                ", Position='" + Position + '\'' +
                ", DrivingLicense='" + DrivingLicense + '\'' +
                ", Contact='" + Contact + '\'' +
                '}';
    }
}

