package com.sliit.mtit.microservice.productownerservice.controller;

import com.sliit.mtit.microservice.productownerservice.dto.ProductOwnerRequest;
import com.sliit.mtit.microservice.productownerservice.dto.ProductOwnerResponse;
import com.sliit.mtit.microservice.productownerservice.service.ProductOwnerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product-owner")
public class ProductOwnerController {

    @Autowired
    private ProductOwnerServiceImpl productOwnerService;

    @PostMapping(consumes = "application/json" , produces = "application/json")
    public @ResponseBody ProductOwnerResponse createProductOwner(@RequestBody ProductOwnerRequest productOwnerRequest){

        System.out.println("Product owner Details :" + productOwnerRequest);

        return productOwnerService.createProductOwner(productOwnerRequest);

    }

}
