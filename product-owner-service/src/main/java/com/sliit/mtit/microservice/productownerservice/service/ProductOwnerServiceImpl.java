package com.sliit.mtit.microservice.productownerservice.service;

import com.sliit.mtit.microservice.productownerservice.dto.AdminCreationRequest;
import com.sliit.mtit.microservice.productownerservice.dto.AdminCreationResponse;
import com.sliit.mtit.microservice.productownerservice.dto.ProductOwnerRequest;
import com.sliit.mtit.microservice.productownerservice.dto.ProductOwnerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class ProductOwnerServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    public ProductOwnerResponse createProductOwner(ProductOwnerRequest productOwnerRequest){

        var adminCreationRequest = new AdminCreationRequest();

        adminCreationRequest.setFullName(productOwnerRequest.getAdminName());
        adminCreationRequest.setEmail(productOwnerRequest.getAdminEmail());
        ResponseEntity<AdminCreationResponse> adminCreationResponse = restTemplate.postForEntity("http://localhost:8188/admin" , adminCreationRequest, AdminCreationResponse.class);

        var productOwnerResponse = new ProductOwnerResponse();

        productOwnerResponse.setProductOwnerId(UUID.randomUUID().toString());
        productOwnerResponse.setAdminId(adminCreationResponse.getBody().getAdminId());
        productOwnerResponse.setMessage("Product Owner Created Successfully");

        return productOwnerResponse;

    }

    @Bean
    private RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

}
