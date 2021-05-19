package com.sliit.mtit.microservice.deliveryservice.controller;

import com.sliit.mtit.microservice.deliveryservice.dto.DeliveryRequest;
import com.sliit.mtit.microservice.deliveryservice.dto.DeliveryResponse;
import com.sliit.mtit.microservice.deliveryservice.service.DeliveryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

    @Autowired
    private DeliveryServiceImpl deliveryService;

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody DeliveryResponse createDelivery(@RequestBody DeliveryRequest deliveryRequest){



        System.out.println("Delivery Details: " + deliveryRequest);



        return deliveryService.createDelivery(deliveryRequest);
    }

}
