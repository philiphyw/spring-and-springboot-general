package com.outlook.philiphyw.todomanager.controller;

import com.outlook.philiphyw.todomanager.model.Todo;
import com.outlook.philiphyw.todomanager.service.TodoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
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
        Todo todo = new Todo(0,name,"please enter todo with 10 plus characters",LocalDate.now().plusDays(7),false);
        modelMap.put("todo",todo);
        if(name != null){
            return "addTodo";
        }else{
            return "login";
        }
    }

    @RequestMapping(value = "add-todo",method = RequestMethod.POST)
    public String addThenGoToTodosJsp(ModelMap modelMap, @Valid Todo todo, BindingResult result){
        String name = (String)modelMap.getAttribute("name");
        if(result.hasErrors()){
            return "addTodo";
        }
        if(name != null){
            todoService.addByUsername(name,todo.getDescription(),todo.getTargetDate(),false);
            return "redirect:find-todo";
        }else{
            return "login";
        }
    }

    @RequestMapping(value = "delete-todo",method = RequestMethod.GET)
    public String deleteThenGoToTodosJsp(@RequestParam long id){
        if(id >= 0){
            todoService.deleteById(id);
        }
            return "redirect:find-todo";
    }

    @RequestMapping(value = "update-todo",method = RequestMethod.GET)
    public String goToUpdateTodoJsp(@RequestParam long id, ModelMap modelMap){
        if(id >= 0){
            Todo todo = todoService.findById(id);
            modelMap.addAttribute("todo",todo);
            return "updateTodo";
        }
        return "redirect:find-todo";
    }

    @RequestMapping(value = "update-todo",method = RequestMethod.POST)
    public String UpdateThenGoToTodoSJsp(ModelMap modelMap, @Valid Todo todo, BindingResult result){
        if(result.hasErrors()){
            return "updateTodo";
        }
        todoService.updateById(todo.getId(),todo);
        return "redirect:find-todo";
    }

}
