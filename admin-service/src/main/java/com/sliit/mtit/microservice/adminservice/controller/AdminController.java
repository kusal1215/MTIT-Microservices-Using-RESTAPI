package com.sliit.mtit.microservice.adminservice.controller;

import com.sliit.mtit.microservice.adminservice.dto.AdminRequest;
import com.sliit.mtit.microservice.adminservice.dto.AdminResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @PostMapping()
    public @ResponseBody
    AdminResponse createAdmin(@RequestBody AdminRequest adminRequest){

        System.out.println("Admin Details :" + adminRequest);

        var adminResponse = new AdminResponse();
        adminResponse.setAdminId(UUID.randomUUID().toString());
        adminResponse.setMessage("Admin created Successfully");

        return adminResponse;
    }

}
