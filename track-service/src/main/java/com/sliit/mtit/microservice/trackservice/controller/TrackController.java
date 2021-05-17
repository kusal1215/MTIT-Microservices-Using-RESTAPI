package com.sliit.mtit.microservice.trackservice.controller;

import com.sliit.mtit.microservice.trackservice.dto.TrackRequest;
import com.sliit.mtit.microservice.trackservice.dto.TrackResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/track")
public class TrackController {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody TrackResponse createTrack(@RequestBody TrackRequest trackRequest){

        System.out.println("Track Details: " + trackRequest);

        var trackResponse = new TrackResponse();
        trackResponse.setTrackID(UUID.randomUUID().toString());
        trackResponse.setMessage("Successfully Initiated the Track Service");
        return trackResponse;
    }

}
