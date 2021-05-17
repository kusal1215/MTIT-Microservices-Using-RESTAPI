package com.sliit.mtit.microservice.refundservice.controller;


import com.sliit.mtit.microservice.refundservice.dto.RefundRequest;
import com.sliit.mtit.microservice.refundservice.dto.RefundResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/refunds")
public class RefundController {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody RefundResponse createRefund(@RequestBody RefundRequest refundRequest){


        System.out.println("Refund Details: " + refundRequest);

        var refundResponse = new RefundResponse();
        refundResponse.setRefundID(UUID.randomUUID().toString());
        refundResponse.setMessage("Successfully made  the refund");
        return refundResponse;
    }

}
