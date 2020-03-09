package com.chibana.tasklist.controller;

import com.chibana.tasklist.service.task.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Rodrigo Chibana
 * Date: 09/03/2020
 **/
@Controller
@RequestMapping("/task")
public class TaskController {

    private TaskService taskService;

    public TaskController(@Autowired final TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/{id}")
    public String getTask() {
        return null;
    }

    @PutMapping
    public String createTask() {
        return null;
    }

    @DeleteMapping
    public String deleteTask() {
        return null;
    }

    @PostMapping
    public String updateTask() {
        return null;
    }

}
