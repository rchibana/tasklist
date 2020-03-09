package com.chibana.tasklist.repository;

import com.chibana.tasklist.model.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Rodrigo Chibana
 * Date: 09/03/2020
 **/
@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {
}
