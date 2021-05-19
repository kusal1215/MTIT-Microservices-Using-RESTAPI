package com.sliit.mtit.microservice.deliverycomplaintservice.controller;

import com.sliit.mtit.microservice.deliverycomplaintservice.dto.DeliveryComplaintRequest;
import com.sliit.mtit.microservice.deliverycomplaintservice.dto.DeliveryComplaintResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/delcomplaints")
public class DeliveryComplaintController {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody DeliveryComplaintResponse createDelComplaint(@RequestBody DeliveryComplaintRequest deliveryComplaintRequest){

        System.out.println("Delivery Complaint Details: " + deliveryComplaintRequest);

        var delComplaintResponse = new DeliveryComplaintResponse();
        delComplaintResponse.setDelComID(UUID.randomUUID().toString());
        delComplaintResponse.setMessage("Successfully lodged the Delivery Complaint");
        return delComplaintResponse;

    }

}
