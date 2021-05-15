package com.sliit.mtit.microservice.noticemanagerservice.controller;

import com.sliit.mtit.microservice.noticemanagerservice.dto.NoticeManagerRequest;
import com.sliit.mtit.microservice.noticemanagerservice.dto.NoticeManagerResponse;
import com.sliit.mtit.microservice.noticemanagerservice.service.NoticeManagerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notice-manager")
public class NoticeManagerController {

    @Autowired
    private NoticeManagerServiceImpl noticeManagerService;

    @PostMapping(consumes = "application/json" , produces = "application/json")
    public @ResponseBody NoticeManagerResponse createNoticeManager(@RequestBody NoticeManagerRequest noticeManagerRequest){

        System.out.println("notice Manager Details:" + noticeManagerRequest);

        return noticeManagerService.createNoticeManager(noticeManagerRequest);

    }

}
