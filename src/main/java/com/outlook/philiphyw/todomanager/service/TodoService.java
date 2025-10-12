package com.outlook.philiphyw.todomanager.service;

import com.outlook.philiphyw.todomanager.model.Todo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TodoService {

    private static List<Todo> todos = new ArrayList<>(Arrays.asList(
            new Todo(1, "rosa", "practice math", LocalDate.now().plusDays(10), false),
            new Todo(2, "max", "practice Chinese", LocalDate.now().plusDays(11), false)
    ));

    public List<Todo> findByUsername(String username) {
        return todos;
    }

    public void addByUsername(String username, String description, LocalDate targetDate, Boolean isDone){
        long newId = (long) (todos.size() + 1);
        todos.add(new Todo(newId, username,description,targetDate, isDone));
    }

    public void deleteById(long targetId){
        todos.removeIf(todo->todo.getId() == targetId);
    }
}
