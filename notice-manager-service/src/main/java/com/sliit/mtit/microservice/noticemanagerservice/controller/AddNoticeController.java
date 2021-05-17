package com.sliit.mtit.microservice.noticemanagerservice.controller;

import com.sliit.mtit.microservice.noticemanagerservice.dto.AddNoticeRequest;
import com.sliit.mtit.microservice.noticemanagerservice.dto.AddNoticeResponse;
import com.sliit.mtit.microservice.noticemanagerservice.service.AddNoticeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/add-notice-by-manager")
public class AddNoticeController {

    @Autowired
    private AddNoticeServiceImpl addNoticeService;

    @PostMapping(consumes = "application/json" , produces = "application/json")
    public @ResponseBody AddNoticeResponse createNotice(@RequestBody AddNoticeRequest addNoticeRequest){

        System.out.println("Notice Details :" + addNoticeRequest);

        return addNoticeService.createNotice(addNoticeRequest);

    }

}
