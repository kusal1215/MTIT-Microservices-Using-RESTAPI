package com.sliit.mtit.microservice.paymentservice.controller;

import com.sliit.mtit.microservice.paymentservice.dto.PaymentRequest;
import com.sliit.mtit.microservice.paymentservice.dto.PaymentResponse;
import com.sliit.mtit.microservice.paymentservice.service.PaymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentServiceImpl paymentService;

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody PaymentResponse createPayment(@RequestBody PaymentRequest paymentRequest){
        System.out.println("Payment Details: " + paymentRequest);
        return paymentService.createPayment(paymentRequest);

    }

}
