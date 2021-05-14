package com.sliit.mtit.microservice.shoppingcartservice.service;

import com.sliit.mtit.microservice.shoppingcartservice.dto.InventoryCreationRequest;
import com.sliit.mtit.microservice.shoppingcartservice.dto.InventoryCreationResponse;
import com.sliit.mtit.microservice.shoppingcartservice.dto.ShoppingCartRequest;
import com.sliit.mtit.microservice.shoppingcartservice.dto.ShoppingCartResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class ShoppingCartServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    public ShoppingCartResponse createShoppingCart(ShoppingCartRequest shoppingCartRequest){

        var inventoryCreationRequest = new InventoryCreationRequest();

        inventoryCreationRequest.setProductName(shoppingCartRequest.getProductName());
        inventoryCreationRequest.setProductPrice(shoppingCartRequest.getProductPrice());
        inventoryCreationRequest.setProductQuantity(shoppingCartRequest.getProductQuantity());
        ResponseEntity<InventoryCreationResponse> inventoryCreationResponse = restTemplate.postForEntity("http://localhost:8184/product-inventory" , inventoryCreationRequest, InventoryCreationResponse.class);

        var shoppingCartResponse =  new ShoppingCartResponse();

        shoppingCartResponse.setShoppingCartId(UUID.randomUUID().toString());
        shoppingCartResponse.setProductId(inventoryCreationResponse.getBody().getProductId());
        shoppingCartResponse.setMessage("you added a product to Shopping Cart Successfully");

        return shoppingCartResponse;
    }

    @Bean
    private RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

}
