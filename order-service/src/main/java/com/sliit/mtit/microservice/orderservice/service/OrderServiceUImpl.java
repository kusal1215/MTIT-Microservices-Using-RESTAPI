package com.sliit.mtit.microservice.orderservice.service;

import com.sliit.mtit.microservice.orderservice.dto.CustomerCreationRequest;
import com.sliit.mtit.microservice.orderservice.dto.CustomerCreationResponse;
import com.sliit.mtit.microservice.orderservice.dto.OrderRequest;
import com.sliit.mtit.microservice.orderservice.dto.OrderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class OrderServiceUImpl {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * Create order order reponse
     *
     * @param orderRequest the order request
     * @return the order reponse
     */

    public OrderResponse createOrder(OrderRequest orderRequest){

        var customerCreationRequest = new CustomerCreationRequest();

        customerCreationRequest.setFullName(orderRequest.getFullName());
        customerCreationRequest.setAddress(orderRequest.getAddress());
        customerCreationRequest.setAge(orderRequest.getAge());
        customerCreationRequest.setEmail(orderRequest.getEmail());
        ResponseEntity<CustomerCreationResponse> customerCreationResponse = restTemplate.postForEntity("http://localhost:8080/customers" , customerCreationRequest, CustomerCreationResponse.class);

        var orderResponse =  new OrderResponse();

        orderResponse.setOrderId(UUID.randomUUID().toString());
        orderResponse.setCustomerId(customerCreationResponse.getBody().getCustomerId());
        orderResponse.setMessage("Successfully created the order");

        return orderResponse;
    }

    @Bean
    private RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

}
