package com.chibana.tasklist.service.task;

import com.chibana.tasklist.model.Task;
import com.chibana.tasklist.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Rodrigo Chibana
 * Date: 09/03/2020
 **/
@Service
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

    public TaskServiceImpl(@Autowired final TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task createTask() {
        return null;
    }

    @Override
    public Task getTask() {
        return null;
    }

    @Override
    public Task updateTask() {
        return null;
    }

    @Override
    public void deleteTask() {

    }
}
