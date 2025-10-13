package com.outlook.philiphyw.todomanager.service;

import com.outlook.philiphyw.todomanager.model.Todo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalLong;

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
        long newId = generateNextId();
        todos.add(new Todo(newId, username,description,targetDate, isDone));
    }

    public void deleteById(long id){
        todos.removeIf(todo->todo.getId() == id);
    }

    public Todo findById(long id){
      return  todos.stream().filter(todo -> todo.getId() == id).findFirst().get();
    }

    public void updateById(long id, Todo updatedTodo){
        todos.replaceAll(todo ->
                todo.getId() == id
                        ? updatedTodo.withId(todo.getId())
                        : todo
        );
    }

    private long generateNextId() {
        OptionalLong maxId = todos.stream()
                .mapToLong(Todo::getId)
                .max();

        return maxId.orElse(0L) + 1;
    }
}
