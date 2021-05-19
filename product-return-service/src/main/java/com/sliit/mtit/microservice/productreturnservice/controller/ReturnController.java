package com.sliit.mtit.microservice.productreturnservice.controller;

import com.sliit.mtit.microservice.productreturnservice.dto.ReturnRequest;
import com.sliit.mtit.microservice.productreturnservice.dto.ReturnResponse;
import com.sliit.mtit.microservice.productreturnservice.service.ProductReturnServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;


@RestController
@RequestMapping("/returns")
public class ReturnController {

    @Autowired
    private ProductReturnServiceImpl productReturnService;

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody ReturnResponse createResponse(@RequestBody ReturnRequest returnRequest){
        System.out.println("Delivery Details: " + returnRequest);
        return  productReturnService.createProductReturn(returnRequest);
    }

}
