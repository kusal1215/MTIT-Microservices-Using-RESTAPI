package com.sliit.mtit.microservice.driverservice.controller;


import com.sliit.mtit.microservice.driverservice.dto.DriverRequest;
import com.sliit.mtit.microservice.driverservice.dto.DriverResponse;
import com.sliit.mtit.microservice.driverservice.service.DriverServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/drivers")
public class DriverController {

    @Autowired
    private DriverServiceImpl driverService;

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody DriverResponse createDriver(@RequestBody DriverRequest driverRequest){
        System.out.println("Driver Details: " + driverRequest);
        return driverService.createLogin(driverRequest);

    }
}
