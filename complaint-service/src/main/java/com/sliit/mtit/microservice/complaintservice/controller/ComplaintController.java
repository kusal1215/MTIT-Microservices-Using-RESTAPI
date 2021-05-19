package com.sliit.mtit.microservice.complaintservice.controller;


import com.sliit.mtit.microservice.complaintservice.dto.ComplaintRequest;
import com.sliit.mtit.microservice.complaintservice.dto.ComplaintResponse;
import com.sliit.mtit.microservice.complaintservice.service.ComplaintServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/complaint")
public class ComplaintController {

    @Autowired
    private ComplaintServiceImpl complaintService;

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody ComplaintResponse createComplaint(@RequestBody ComplaintRequest complaintRequest){


        System.out.println("Complaint Details: " + complaintRequest);

        return complaintService.createComplaint(complaintRequest);

    }
}
