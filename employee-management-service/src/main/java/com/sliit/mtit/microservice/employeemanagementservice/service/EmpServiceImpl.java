package com.sliit.mtit.microservice.employeemanagementservice.service;

import com.sliit.mtit.microservice.employeemanagementservice.dto.DriverCreationRequest;
import com.sliit.mtit.microservice.employeemanagementservice.dto.DriverCreationResponse;
import com.sliit.mtit.microservice.employeemanagementservice.dto.EmpRequest;
import com.sliit.mtit.microservice.employeemanagementservice.dto.EmpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class EmpServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    public EmpResponse createEmp(EmpRequest empRequest){

        var driverCreationRequest = new DriverCreationRequest();
        var empResponse = new EmpResponse();

        //If position field includes "Driver"/ "driver"
        if (empRequest.getPosition().contains("Driver") || empRequest.getPosition().contains("driver")) {
            //API Request Object
            driverCreationRequest.setFullName(empRequest.getFullName());
            driverCreationRequest.setAge(empRequest.getAge());
            driverCreationRequest.setAddress(empRequest.getAddress());
            driverCreationRequest.setPosition(empRequest.getPosition());
            driverCreationRequest.setDrivingLicense(empRequest.getDrivingLicense());
            driverCreationRequest.setContact(empRequest.getContact());
            ResponseEntity<DriverCreationResponse> driverCreationResponse = restTemplate.postForEntity("http://localhost:9097/drivers", driverCreationRequest, DriverCreationResponse.class);

            //Access the Profile creation response and Login creation response
            empResponse.setProfileCreationMessage(driverCreationResponse.getBody().getMessage());
            empResponse.setLoginCreationMessage(driverCreationResponse.getBody().getLoginCreationMessage());
        }


        empResponse.setEmpID(UUID.randomUUID().toString());
        empResponse.setMessage("Employee Details added Successfully");

        return empResponse;

    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){return builder.build();}
}
