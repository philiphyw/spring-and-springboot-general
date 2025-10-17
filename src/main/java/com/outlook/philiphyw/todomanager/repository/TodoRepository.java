package com.outlook.philiphyw.todomanager.repository;

import com.outlook.philiphyw.todomanager.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    public List<Todo> findByUsername(String username);
}
