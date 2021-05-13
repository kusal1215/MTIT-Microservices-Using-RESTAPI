package com.sliit.mtit.microservice.customerfeedbackservice.controller;

import com.sliit.mtit.microservice.customerfeedbackservice.dto.CustomerFeedbackRequest;
import com.sliit.mtit.microservice.customerfeedbackservice.dto.CustomerFeedbackResponse;
import com.sliit.mtit.microservice.customerfeedbackservice.service.CustomerFeedbackServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer-feedback")
public class CustomerFeedbackController {

    @Autowired
    private CustomerFeedbackServiceImpl customerFeedbackService;

    @PostMapping(consumes = "application/json" , produces = "application/json")
    public @ResponseBody CustomerFeedbackResponse createCustomerFeedback(@RequestBody CustomerFeedbackRequest customerFeedbackRequest){

        System.out.println("Feedback Details:" + customerFeedbackRequest);

        return customerFeedbackService.createCustomerFeedback( customerFeedbackRequest );
    }

}
