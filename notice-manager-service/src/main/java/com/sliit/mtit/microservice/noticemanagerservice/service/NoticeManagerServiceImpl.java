package com.sliit.mtit.microservice.noticemanagerservice.service;

import com.sliit.mtit.microservice.noticemanagerservice.dto.AdminCreationRequest;
import com.sliit.mtit.microservice.noticemanagerservice.dto.AdminCreationResponse;
import com.sliit.mtit.microservice.noticemanagerservice.dto.NoticeManagerRequest;
import com.sliit.mtit.microservice.noticemanagerservice.dto.NoticeManagerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class NoticeManagerServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    public NoticeManagerResponse createNoticeManager(NoticeManagerRequest noticeManagerRequest){

        var adminCreationRequest = new AdminCreationRequest();

        adminCreationRequest.setFullName(noticeManagerRequest.getAdminName());
        adminCreationRequest.setEmail(noticeManagerRequest.getAdminEmail());
        ResponseEntity<AdminCreationResponse> adminCreationResponse = restTemplate.postForEntity("http://localhost:8188/admin" , adminCreationRequest, AdminCreationResponse.class);

        var noticeManagerResponse =  new NoticeManagerResponse();

        noticeManagerResponse.setNoticeManagerId(UUID.randomUUID().toString());
        noticeManagerResponse.setAdminId(adminCreationResponse.getBody().getAdminId());
        noticeManagerResponse.setMessage("Notice Manager Created Successfully");

        return noticeManagerResponse;

    }

    @Bean
    private RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
}
