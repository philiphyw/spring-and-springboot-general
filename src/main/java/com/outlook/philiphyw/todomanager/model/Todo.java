package com.outlook.philiphyw.todomanager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Size;
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
@With
@Builder
public class Todo {
    @Id
    @GeneratedValue
    private long id;
    private String username;
    @Size(min=10, message="Description must be 10 plus characters")
    private String description;
    @FutureOrPresent(message = "Date must not be earlier than today")
    private LocalDate targetDate;
    private boolean done;
}
