package com.outlook.philiphyw.learn_spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatServiceController {
    @Autowired
    private ChatServiceConfiguration chatServiceConfiguration;

    @RequestMapping("/chat-service-configuration")
    public ChatServiceConfiguration getChatServiceConfiguration(){
        return this.chatServiceConfiguration;
    }
}
