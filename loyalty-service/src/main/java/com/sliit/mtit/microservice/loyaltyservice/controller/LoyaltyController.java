package com.sliit.mtit.microservice.loyaltyservice.controller;

import com.sliit.mtit.microservice.loyaltyservice.dto.LoyaltyRequest;
import com.sliit.mtit.microservice.loyaltyservice.dto.LoyaltyResponse;
import com.sliit.mtit.microservice.loyaltyservice.service.LoyaltyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loyalty")
public class LoyaltyController {

    @Autowired
    private LoyaltyServiceImpl loyaltyService;

    @PostMapping(consumes = "application/json" , produces = "application/json")
    public @ResponseBody LoyaltyResponse createLoyalty(@RequestBody LoyaltyRequest loyaltyRequest){

        System.out.println("Loyalty Details :" + loyaltyRequest);

        return loyaltyService.createLoyalty(loyaltyRequest);

    }

}
