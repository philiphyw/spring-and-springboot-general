package com.outlook.philiphyw.todomanager.controller;

import com.outlook.philiphyw.todomanager.model.Todo;
import com.outlook.philiphyw.todomanager.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ToDoController {
    @Autowired
    private TodoService todoService;

    @RequestMapping(value = "find-todo",method = RequestMethod.GET)
    public String findTodoByName(@RequestParam String name, ModelMap modelMap){
        if(name != null){
            List<Todo> todos = todoService.findByUsername(name);
            modelMap.put("clientName",name);
            modelMap.addAttribute("todos",todos);
            return "todos";
        }else{
            return "login";
        }
    }
}
