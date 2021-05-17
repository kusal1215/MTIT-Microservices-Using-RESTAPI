package com.sliit.mtit.microservice.noticemanagerservice.service;

import com.sliit.mtit.microservice.noticemanagerservice.dto.AddNoticeRequest;
import com.sliit.mtit.microservice.noticemanagerservice.dto.AddNoticeResponse;
import com.sliit.mtit.microservice.noticemanagerservice.dto.CustomerCreationRequest;
import com.sliit.mtit.microservice.noticemanagerservice.dto.CustomerCreationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class AddNoticeServiceImpl {

    @Autowired
    private RestTemplate restTemplateN;

    public AddNoticeResponse createNotice(AddNoticeRequest addNoticeRequest){

        var customerCreationRequest = new CustomerCreationRequest();

        customerCreationRequest.setFullName(addNoticeRequest.getFullName());
        customerCreationRequest.setAddress(addNoticeRequest.getAddress());
        customerCreationRequest.setAge(addNoticeRequest.getAge());
        customerCreationRequest.setEmail(addNoticeRequest.getAge());

        ResponseEntity<CustomerCreationResponse> customerCreationResponse = restTemplateN.postForEntity("http://localhost:8080/customers" , customerCreationRequest, CustomerCreationResponse.class);

        var addNoticeResponse = new  AddNoticeResponse();

        addNoticeResponse.setNoticedId(UUID.randomUUID().toString());
        addNoticeResponse.setCustomerId(customerCreationResponse.getBody().getCustomerId());
        addNoticeResponse.setMessage("Notice added successfully");

        return addNoticeResponse;

    }

    @Bean
    private RestTemplate restTemplateN(RestTemplateBuilder builder) {
        return builder.build();
    }

}
