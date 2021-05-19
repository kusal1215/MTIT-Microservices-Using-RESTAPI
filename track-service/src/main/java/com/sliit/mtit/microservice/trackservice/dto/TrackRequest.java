package com.sliit.mtit.microservice.trackservice.dto;

public class TrackRequest {

    private String Location;


    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    @Override
    public String toString() {
        return "TrackRequest{" +
                "Location='" + Location + '\'' +
                '}';
    }
}
