package com.outlook.philiphyw.todomanager.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @RequestMapping(value="login",method=RequestMethod.GET)
    public String goToLoginJsp(@RequestParam(value="name",required = false) String name, ModelMap modelMap){
        if(name != null){
            logger.debug("Get Request param is {}",name);
            modelMap.put("clientName",name);
        }
        return "login";
    }

    @RequestMapping(value="login", method=RequestMethod.POST)
    public String goToWelcomeJsp(@RequestParam String username, @RequestParam String password, ModelMap modelMap){
            logger.debug("Post Request param is {}",username);
            modelMap.put("clientName",username);
            return "welcome";
    }
}
