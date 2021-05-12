package com.sliit.mtit.microservice.loyaltyservice.service;

import com.sliit.mtit.microservice.loyaltyservice.dto.CustomerLoyaltyCreationRequest;
import com.sliit.mtit.microservice.loyaltyservice.dto.CustomerLoyaltyCreationResponse;
import com.sliit.mtit.microservice.loyaltyservice.dto.LoyaltyRequest;
import com.sliit.mtit.microservice.loyaltyservice.dto.LoyaltyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class LoyaltyServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * Create loyalty response
     *
     * @param loyaltyRequest the loyalty request
     * @return the loyalty response
     */

    public LoyaltyResponse createLoyalty(LoyaltyRequest loyaltyRequest){

        var customerLoyaltyCreationRequest = new CustomerLoyaltyCreationRequest();

        customerLoyaltyCreationRequest.setFullName(loyaltyRequest.getFullName());
        customerLoyaltyCreationRequest.setAddress(loyaltyRequest.getAddress());
        customerLoyaltyCreationRequest.setAge(loyaltyRequest.getAge());
        customerLoyaltyCreationRequest.setEmail(loyaltyRequest.getEmail());

        ResponseEntity<CustomerLoyaltyCreationResponse> customerLoyaltyCreationResponse = restTemplate.postForEntity("http://localhost:8080/customers" , customerLoyaltyCreationRequest, CustomerLoyaltyCreationResponse.class);

        var loyaltyResponse = new LoyaltyResponse();

        loyaltyResponse.setLoyaltyId(UUID.randomUUID().toString());
        loyaltyResponse.setCustomerId(customerLoyaltyCreationResponse.getBody().getCustomerId());
        loyaltyResponse.setMessage("you have successfully register as loyalty member");

        return loyaltyResponse;

    }

    @Bean
    private RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

}
