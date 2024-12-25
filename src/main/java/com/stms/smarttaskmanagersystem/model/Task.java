package com.stms.smarttaskmanagersystem.model;


import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Entity
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private LocalDate date;
    private LocalDate dueDate;

    @Enumerated(EnumType.STRING)
    private Priority priority;

    private Boolean status;

    @ManyToOne
    private User user;

    @ManyToOne
    private Category category;

    @ManyToOne
    @JoinColumn(name = "depends_on")
    private Task dependsOn;
}
