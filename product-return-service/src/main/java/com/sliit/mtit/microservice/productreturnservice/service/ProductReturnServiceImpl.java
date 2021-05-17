package com.sliit.mtit.microservice.productreturnservice.service;

import com.sliit.mtit.microservice.productreturnservice.dto.RefundCreationRequest;
import com.sliit.mtit.microservice.productreturnservice.dto.RefundCreationResponse;
import com.sliit.mtit.microservice.productreturnservice.dto.ReturnRequest;
import com.sliit.mtit.microservice.productreturnservice.dto.ReturnResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class ProductReturnServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    public ReturnResponse createProductReturn(ReturnRequest returnRequest){

        var refundCreationRequest = new RefundCreationRequest();
        refundCreationRequest.setCustomerID(returnRequest.getCustomerID());
        refundCreationRequest.setCustomerName(returnRequest.getCustomerName());
        refundCreationRequest.setAccountNumber(returnRequest.getAccountNumber());
        refundCreationRequest.setTotPrice(returnRequest.getPrice());
        ResponseEntity<RefundCreationResponse> refundCreationResponse = restTemplate.postForEntity("http://localhost:9091/refunds", refundCreationRequest, RefundCreationResponse.class);

        var returnResponse = new ReturnResponse();
        returnResponse.setProductReturnID(UUID.randomUUID().toString());
        returnResponse.setRefundID(refundCreationResponse.getBody().getRefundID());
        returnResponse.setMessage("Successfully start the Product Return Process");


        return returnResponse;
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){return builder.build();}
}
