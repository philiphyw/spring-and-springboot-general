package com.outlook.philiphyw.todomanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class WelcomeController {

    @RequestMapping(value="/",method=RequestMethod.GET)
    public String goToWelcomeJsp(ModelMap modelMap){
        modelMap.addAttribute("name","hardcoded name");
        return "welcome";
    }

}
