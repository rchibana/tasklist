package com.chibana.tasklist.service.task;

import com.chibana.tasklist.model.Task;

/**
 * Created by Rodrigo Chibana
 * Date: 09/03/2020
 **/
public interface TaskService {

    Task createTask();

    Task getTask();

    Task updateTask();

    void deleteTask();

}
