package com.stms.smarttaskmanagersystem.controller;


import com.stms.smarttaskmanagersystem.model.TaskEntity;
import com.stms.smarttaskmanagersystem.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<org.springframework.scheduling.config.Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping
    public TaskEntity createTask(@RequestBody TaskEntity task) {
        return taskService.saveTask(task);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }
}