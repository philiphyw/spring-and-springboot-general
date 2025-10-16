package com.outlook.philiphyw.todomanager.controller;

import com.outlook.philiphyw.todomanager.security.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
public class WelcomeController {
    @Autowired
    AuthenticationService authenticationService;

    @RequestMapping(value="/",method=RequestMethod.GET)
    public String goToWelcomeJsp(ModelMap modelMap){
        modelMap.addAttribute("name",authenticationService.getLoggedInUsername());
        return "welcome";
    }
}
