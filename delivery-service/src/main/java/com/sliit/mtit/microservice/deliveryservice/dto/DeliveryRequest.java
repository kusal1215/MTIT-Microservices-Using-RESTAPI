package com.sliit.mtit.microservice.deliveryservice.dto;

public class DeliveryRequest {

    private String DriverName;
    private String DriverContact;
    private String OrderID;
    private String Address;
    private String CurrentLocation;
    private String CustomerID;

    public String getDriverName() {
        return DriverName;
    }

    public void setDriverName(String driverName) {
        DriverName = driverName;
    }

    public String getDriverContact() {
        return DriverContact;
    }

    public void setDriverContact(String driverContact) {
        DriverContact = driverContact;
    }

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String orderID) {
        OrderID = orderID;
    }

    public String getCurrentLocation() {
        return CurrentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        CurrentLocation = currentLocation;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String customerID) {
        CustomerID = customerID;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "DeliveryRequest{" +
                "DriverName='" + DriverName + '\'' +
                ", DriverContact='" + DriverContact + '\'' +
                ", OrderID='" + OrderID + '\'' +
                ", Address='" + Address + '\'' +
                ", CurrentLocation='" + CurrentLocation + '\'' +
                ", CustomerID='" + CustomerID + '\'' +
                '}';
    }
}
