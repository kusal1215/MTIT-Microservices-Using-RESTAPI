package com.sliit.mtit.microservice.deliverycomplaintservice.dto;

public class DeliveryComplaintRequest {

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

    @Override
    public String toString() {
        return "DeliveryComplaintRequest{" +
                "DriverID='" + DriverID + '\'' +
                ", DriverName='" + DriverName + '\'' +
                ", Reason='" + Reason + '\'' +
                '}';
    }
}
