package com.stms.smarttaskmanagersystem.model;


import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.List;

@Entity
public class Dependency {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "task_id")
    private TaskEntity task;

    @ElementCollection
    private List<Long> dependentTaskIds;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public TaskEntity getTask() {
        return task;
    }

    public void setTask(TaskEntity task) {
        this.task = task;
    }

    public List<Long> getDependentTaskIds() {
        return dependentTaskIds;
    }

    public void setDependentTaskIds(List<Long> dependentTaskIds) {
        this.dependentTaskIds = dependentTaskIds;
    }
}
