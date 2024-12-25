package com.stms.smarttaskmanagersystem.service;


import com.stms.smarttaskmanagersystem.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    // Implement CRUD methods
}
