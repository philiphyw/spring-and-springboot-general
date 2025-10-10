package com.outlook.philiphyw.todomanager.controller;

import com.outlook.philiphyw.todomanager.service.AuthenticationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private AuthenticationService authenticationService;

    @RequestMapping(value="login",method=RequestMethod.GET)
    public String goToLoginJsp(@RequestParam(value="name",required = false) String name, ModelMap modelMap){
        if(name != null){
            logger.debug("Get Request param is {}",name);
            modelMap.put("name",name);
        }
        return "login";
    }

    @RequestMapping(value="login", method=RequestMethod.POST)
    public String goToWelcomeJsp(@RequestParam String name, @RequestParam String password, ModelMap modelMap){
            logger.debug("Post Request param is {}",name);
        if (authenticationService.authenticate(name, password)) {
            modelMap.put("name",name);
            return "welcome";
        }else{
            modelMap.put("errorMessage","Please input valid name and password");
            return "login";
        }

    }
}
