package com.sliit.mtit.microservice.productownerservice.service;

import com.sliit.mtit.microservice.productownerservice.dto.AddProductRequest;
import com.sliit.mtit.microservice.productownerservice.dto.AddProductResponse;
import com.sliit.mtit.microservice.productownerservice.dto.InventoryCreationRequest;
import com.sliit.mtit.microservice.productownerservice.dto.InventoryCreationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class ProductAddServiceImpl {

    @Autowired
    private RestTemplate restTemplatep;

    public AddProductResponse addProductToInventory(AddProductRequest addProductRequest){

        var inventoryCreationRequest = new InventoryCreationRequest();

        inventoryCreationRequest.setProductName(addProductRequest.getProductName());
        inventoryCreationRequest.setProductPrice(addProductRequest.getProductPrice());
        inventoryCreationRequest.setProductQuantity(addProductRequest.getProductQuantity());
        ResponseEntity<InventoryCreationResponse> inventoryCreationResponse = restTemplatep.postForEntity("http://localhost:8184/product-inventory" , inventoryCreationRequest, InventoryCreationResponse.class);

        var addProductResponse = new AddProductResponse();

        addProductResponse.setProductAddedId(UUID.randomUUID().toString());
        addProductResponse.setProductId(inventoryCreationResponse.getBody().getProductId());
        addProductResponse.setMessage("You added Product to Product Inventory successfully");

        return addProductResponse;
    }

    @Bean
    private RestTemplate restTemplatep(RestTemplateBuilder builder) {
        return builder.build();
    }
}
