package com.sliit.mtit.microservice.customerfeedbackservice.service;

import com.sliit.mtit.microservice.customerfeedbackservice.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class CustomerFeedbackServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    public CustomerFeedbackResponse createCustomerFeedback(CustomerFeedbackRequest customerFeedbackRequest){

        var customerCreationRequest = new CustomerCreationRequest();

        customerCreationRequest.setFullName(customerFeedbackRequest.getFullName());
        customerCreationRequest.setAddress(customerFeedbackRequest.getAddress());
        customerCreationRequest.setAge(customerFeedbackRequest.getAge());
        customerCreationRequest.setEmail(customerFeedbackRequest.getEmail());
        ResponseEntity<CustomerCreationResponse> customerCreationResponse = restTemplate.postForEntity("http://localhost:8080/customers" , customerCreationRequest, CustomerCreationResponse.class);

        var inventoryCreationRequest =  new InventoryCreationRequest();

        inventoryCreationRequest.setProductName(customerFeedbackRequest.getProductName());
        inventoryCreationRequest.setProductPrice(customerFeedbackRequest.getProductPrice());
        inventoryCreationRequest.setProductQuantity(customerFeedbackRequest.getProductQuantity());
        ResponseEntity<InventoryCreationResponse> inventoryCreationResponse = restTemplate.postForEntity("http://localhost:8184/product-inventory" , inventoryCreationRequest, InventoryCreationResponse.class);

        var customerFeedbackResponse = new CustomerFeedbackResponse();

        customerFeedbackResponse.setFeedbackId(UUID.randomUUID().toString());
        customerFeedbackResponse.setCustomerId(customerCreationResponse.getBody().getCustomerId());
        customerFeedbackResponse.setProductId(inventoryCreationResponse.getBody().getProductId());
        customerFeedbackResponse.setMessage("Successfully added the feedback to the selected product");

        return  customerFeedbackResponse;
    }

    @Bean
    private RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

}
