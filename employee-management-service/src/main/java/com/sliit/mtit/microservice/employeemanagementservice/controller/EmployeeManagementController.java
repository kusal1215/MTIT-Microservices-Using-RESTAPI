package com.sliit.mtit.microservice.employeemanagementservice.controller;

import com.sliit.mtit.microservice.employeemanagementservice.dto.EmpRequest;
import com.sliit.mtit.microservice.employeemanagementservice.dto.EmpResponse;
import com.sliit.mtit.microservice.employeemanagementservice.service.EmpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/Emp")
public class EmployeeManagementController {


    @Autowired
    private EmpServiceImpl empService;
    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody EmpResponse createEmployee(@RequestBody EmpRequest empRequest){
        System.out.println("Employee Details: " + empRequest);
        return empService.createEmp(empRequest);
    }

}
