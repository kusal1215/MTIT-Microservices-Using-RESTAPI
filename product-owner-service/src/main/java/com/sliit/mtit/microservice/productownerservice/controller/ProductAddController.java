package com.sliit.mtit.microservice.productownerservice.controller;

import com.sliit.mtit.microservice.productownerservice.dto.AddProductRequest;
import com.sliit.mtit.microservice.productownerservice.dto.AddProductResponse;
import com.sliit.mtit.microservice.productownerservice.service.ProductAddServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/add-product-by-manager")
public class ProductAddController {

    @Autowired
    private ProductAddServiceImpl productAddService;

    @PostMapping(consumes = "application/json" ,  produces = "application/json")
    public @ResponseBody AddProductResponse addProductToInventory(@RequestBody AddProductRequest addProductRequest){

        System.out.println("Added Product Details:" + addProductRequest);

        return productAddService.addProductToInventory(addProductRequest);

    }

}
