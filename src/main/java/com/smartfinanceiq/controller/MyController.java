package com.smartfinanceiq.controller;

import com.smartfinanceiq.service.ChatGptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private ChatGptService chatGptService;

    @GetMapping("/test")
    public String test() {

        String[] objs = new String[1];

        return chatGptService.getChatGptReply("什麼是 K 線", objs);

    }

}
