package com.outlook.philiphyw.todomanager.controller;

import com.outlook.philiphyw.todomanager.model.Todo;
import com.outlook.philiphyw.todomanager.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Controller
@SessionAttributes("name")
public class ToDoController {
    @Autowired
    private TodoService todoService;

    @RequestMapping(value = "find-todo",method = RequestMethod.GET)
    public String findTodoByName(ModelMap modelMap){
        String name = (String)modelMap.getAttribute("name");
        if(name != null){
            List<Todo> todos = todoService.findByUsername(name);
            modelMap.addAttribute("todos",todos);
            return "todos";
        }else{
            return "login";
        }
    }

    @RequestMapping(value = "add-todo",method = RequestMethod.GET)
    public String addTodoByName(ModelMap modelMap){
        String name = (String)modelMap.getAttribute("name");
        if(name != null){
            return "addTodo";
        }else{
            return "login";
        }
    }

    @RequestMapping(value = "add-todo",method = RequestMethod.POST)
    public String gotoTodosJsp(@RequestParam String description, @RequestParam LocalDate targetDate, ModelMap modelMap){
        String name = (String)modelMap.getAttribute("name");
        if(name != null){
            todoService.addByUsername(name,description,targetDate,false);
            List<Todo> todos = todoService.findByUsername(name);
            modelMap.addAttribute("todos",todos);
            return "redirect:find-todo";
        }else{
            return "login";
        }
    }
}
