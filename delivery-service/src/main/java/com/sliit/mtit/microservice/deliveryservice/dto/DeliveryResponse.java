package com.sliit.mtit.microservice.deliveryservice.dto;

public class DeliveryResponse {

    private String DeliveryID;
    private String TrackID;
    private String Message;

    public String getDeliveryID() {
        return DeliveryID;
    }

    public void setDeliveryID(String deliveryID) {
        DeliveryID = deliveryID;
    }

    public String getTrackID() {
        return TrackID;
    }

    public void setTrackID(String trackID) {
        TrackID = trackID;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
