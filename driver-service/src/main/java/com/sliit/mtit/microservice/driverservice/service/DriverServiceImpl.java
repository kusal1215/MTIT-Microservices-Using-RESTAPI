package com.sliit.mtit.microservice.driverservice.service;


import com.sliit.mtit.microservice.driverservice.dto.DriverRequest;
import com.sliit.mtit.microservice.driverservice.dto.DriverResponse;
import com.sliit.mtit.microservice.driverservice.dto.LoginCreationRequest;
import com.sliit.mtit.microservice.driverservice.dto.LoginCreationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DriverServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    public DriverResponse createLogin(DriverRequest driverRequest){

        //API request Object
        var loginCreationRequest = new LoginCreationRequest();
        loginCreationRequest.setUserName(driverRequest.getDrivingLicense());
        loginCreationRequest.setPassword(driverRequest.getDrivingLicense() + driverRequest.getContact());
        ResponseEntity<LoginCreationResponse> loginCreationResponse = restTemplate.postForEntity("http://localhost:9191/login",  loginCreationRequest, LoginCreationResponse.class);

        var driverResponse = new DriverResponse();
        driverResponse.setLoginCreationMessage(loginCreationResponse.getBody().getMessage());
        driverResponse.setMessage("Successfully created the Driver");

        return driverResponse;
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){return builder.build();}
}
