package com.chibana.tasklist.repository;

import com.chibana.tasklist.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Rodrigo Chibana
 * Date: 09/03/2020
 **/
@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
}
