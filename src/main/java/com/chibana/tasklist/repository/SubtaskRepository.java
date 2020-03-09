package com.chibana.tasklist.repository;

import com.chibana.tasklist.model.Subtask;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Rodrigo Chibana
 * Date: 09/03/2020
 **/

@Repository
public interface SubtaskRepository extends CrudRepository<Subtask, Long> {
}
