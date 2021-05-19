package com.sliit.mtit.microservice.complaintservice.service;

import com.sliit.mtit.microservice.complaintservice.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class ComplaintServiceImpl {

    @Autowired
    private RestTemplate restTemplate;
    public ComplaintResponse createComplaint(ComplaintRequest complaintRequest){

        var delComplaintCreationRequest = new DelComplaintCreationRequest();
        var prodComplaintCreationRequest = new ProdComplaintCreationRequest();
        var complaintResponse = new ComplaintResponse();

        if (complaintRequest.getComplaintType().equalsIgnoreCase("Delivery")){
            delComplaintCreationRequest.setDriverID(complaintRequest.getDriverID());
            delComplaintCreationRequest.setDriverName(complaintRequest.getDriverName());
            delComplaintCreationRequest.setReason(complaintRequest.getReason());
            ResponseEntity<DelComplaintCreationResponse> delComplaintCreationResponse = restTemplate.postForEntity("http://localhost:9099/delcomplaints", delComplaintCreationRequest, DelComplaintCreationResponse.class);
            complaintResponse.setDelComID(delComplaintCreationResponse.getBody().getDelComID());
       }
        else if (complaintRequest.getComplaintType().equalsIgnoreCase("Product")){
            prodComplaintCreationRequest.setProductID(complaintRequest.getProductID());
            prodComplaintCreationRequest.setProductName(complaintRequest.getProductName());
            prodComplaintCreationRequest.setReason(complaintRequest.getReason());
            ResponseEntity<ProdComplaintCreationResponse> prodComplaintCreationResponse = restTemplate.postForEntity("http://localhost:9190/prodcomplaints", prodComplaintCreationRequest, ProdComplaintCreationResponse.class);
            complaintResponse.setProdComID(prodComplaintCreationResponse.getBody().getProdComID());
        }

        complaintResponse.setComplaintID(UUID.randomUUID().toString());
        complaintResponse.setMessage("Successfully recorded the complaint");

        return complaintResponse;
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){return builder.build();}

}
