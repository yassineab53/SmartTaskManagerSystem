package com.stms.smarttaskmanagersystem.service;


import com.stms.smarttaskmanagersystem.model.Task;
import com.stms.smarttaskmanagersystem.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public List<org.springframework.scheduling.config.Task> getAllTasks() {
        return taskRepository.findAll();
    }

    /*public Task saveTask(Task task) {
        return taskRepository.save(task);
    }*/

    public void deleteTask(Long id) {
        taskRepository.deleteById(Math.toIntExact(id));
    }
}
