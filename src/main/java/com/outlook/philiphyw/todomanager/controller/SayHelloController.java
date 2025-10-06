package com.outlook.philiphyw.todomanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class SayHelloController {
    @GetMapping("say-hello")
    @ResponseBody
    public String sayHello(){
        return "Hello, What're you learning today?";
    }

//    SpringBoot will try to load jsp files automatically in the path "/src/main/resources/META-INF/resources/WEB-INF/jsp/"
@GetMapping("say-hello-jsp")
public String sayHelloJsp(){
    return "sayHello";
}
}
