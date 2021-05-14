package com.sliit.mtit.microservice.wishlistservice.service;

import com.sliit.mtit.microservice.wishlistservice.dto.InventoryWishListCreationRequest;
import com.sliit.mtit.microservice.wishlistservice.dto.InventoryWishListCreationResponse;
import com.sliit.mtit.microservice.wishlistservice.dto.WishListRequest;
import com.sliit.mtit.microservice.wishlistservice.dto.WishListResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class WishListServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    public WishListResponse createWishList(WishListRequest wishListRequest){

        var inventoryWishListCreationRequest = new InventoryWishListCreationRequest();

        inventoryWishListCreationRequest.setProductName(wishListRequest.getProductName());
        inventoryWishListCreationRequest.setProductPrice(wishListRequest.getProductPrice());
        inventoryWishListCreationRequest.setProductQuantity(wishListRequest.getProductQuantity());
        ResponseEntity<InventoryWishListCreationResponse> inventoryWishListCreationResponse = restTemplate.postForEntity("http://localhost:8184/product-inventory" , inventoryWishListCreationRequest, InventoryWishListCreationResponse.class);

        var wishListResponse = new WishListResponse();

        wishListResponse.setWishListId(UUID.randomUUID().toString());
        wishListResponse.setProductId(inventoryWishListCreationResponse.getBody().getProductId());
        wishListResponse.setMessage("you added product to Wishlist");

        return wishListResponse;

    }

    @Bean
    private RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
}
