package com.sliit.mtit.microservice.deliveryservice.service;

import com.sliit.mtit.microservice.deliveryservice.dto.DeliveryRequest;
import com.sliit.mtit.microservice.deliveryservice.dto.DeliveryResponse;
import com.sliit.mtit.microservice.deliveryservice.dto.TrackCreationRequest;
import com.sliit.mtit.microservice.deliveryservice.dto.TrackCreationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class DeliveryServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    public DeliveryResponse createDelivery(DeliveryRequest deliveryRequest){

        var trackCreationRequest = new TrackCreationRequest();
        trackCreationRequest.setLocation(deliveryRequest.getCurrentLocation());
        ResponseEntity<TrackCreationResponse> trackCreationResponse = restTemplate.postForEntity("http://localhost:9093/track", trackCreationRequest, TrackCreationResponse.class);

        var deliveryResponse = new DeliveryResponse();
        deliveryResponse.setDeliveryID(UUID.randomUUID().toString());
        deliveryResponse.setTrackID(trackCreationResponse.getBody().getTrackID());
        deliveryResponse.setMessage("Successfully start the delivery process");

        return deliveryResponse;
    }

    @Bean
    public RestTemplate restTemplate (RestTemplateBuilder builder){return builder.build();}
}
