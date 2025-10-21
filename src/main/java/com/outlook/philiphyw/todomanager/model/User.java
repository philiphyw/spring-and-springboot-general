package com.outlook.philiphyw.todomanager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "\"user\"")
public class User {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private LocalDate birthDate;
}
