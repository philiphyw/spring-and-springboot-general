package com.outlook.philiphyw.todomanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {
    @GetMapping("login")
    public String showLoginJsp(@RequestParam(value="name",required = false) String name, ModelMap modelMap){
        if(name != null){
            modelMap.put("clientName",name);
        }
        return "login";
    }
}
