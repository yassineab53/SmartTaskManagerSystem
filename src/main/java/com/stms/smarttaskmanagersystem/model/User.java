package com.stms.smarttaskmanagersystem.model;


import jakarta.persistence.*;
//import org.hibernate.annotations.CascadeType;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.scheduling.config.Task;

import java.util.List;

@Entity
@Data
public class User {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Task> tasks;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
