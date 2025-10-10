package com.outlook.philiphyw.todomanager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
@Component
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Todo {
    @Id
    private long id;
    private String username;
    private String description;
    private LocalDate targetDate;
    private boolean done;
}
