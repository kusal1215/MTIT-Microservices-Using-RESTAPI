package com.sliit.mtit.microservice.productcomplaintservice.controller;

import com.sliit.mtit.microservice.productcomplaintservice.dto.ProductComplaintRequest;
import com.sliit.mtit.microservice.productcomplaintservice.dto.ProductComplaintResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/prodcomplaints")
public class ProductComplaintController {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody ProductComplaintResponse createProdComplaint(@RequestBody ProductComplaintRequest productComplaintRequest){

        System.out.println("Product Complaint Details: " + productComplaintRequest);

        var prodComplaintResponse = new ProductComplaintResponse();
        prodComplaintResponse.setProdComID(UUID.randomUUID().toString());
        prodComplaintResponse.setMessage("Successfully lodged the Product Complaint");
        return prodComplaintResponse;

    }
}
