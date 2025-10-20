package com.outlook.philiphyw.todomanager.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloWorldController {
    @GetMapping("/hello-world")
    @ResponseBody
    public String getHelloWorld(){
        return "Hello World!!";
    }
}
