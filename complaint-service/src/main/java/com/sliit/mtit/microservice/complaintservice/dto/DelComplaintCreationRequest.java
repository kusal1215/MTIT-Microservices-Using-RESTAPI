package com.sliit.mtit.microservice.complaintservice.dto;

public class DelComplaintCreationRequest {

    private String DriverID;
    private String DriverName;
    private String Reason;


    public String getDriverID() {
        return DriverID;
    }

    public void setDriverID(String driverID) {
        DriverID = driverID;
    }

    public String getDriverName() {
        return DriverName;
    }

    public void setDriverName(String driverName) {
        DriverName = driverName;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String reason) {
        Reason = reason;
    }
}
