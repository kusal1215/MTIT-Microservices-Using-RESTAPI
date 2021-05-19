package com.sliit.mtit.microservice.loginservice.controller;


import com.sliit.mtit.microservice.loginservice.dto.LoginRequest;
import com.sliit.mtit.microservice.loginservice.dto.LoginResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody LoginResponse createLogin(@RequestBody LoginRequest loginRequest){

        System.out.println("Login Details: " + loginRequest);

        var loginResponse = new LoginResponse();
        loginResponse.setMessage("Successfully Created the Driver Login");
        return loginResponse;

    }
}
