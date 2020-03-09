package com.chibana.tasklist.service.person;

import com.chibana.tasklist.model.Person;

/**
 * Created by Rodrigo Chibana
 * Date: 09/03/2020
 **/
public interface PersonService {

    Person createPerson();

    Person getPerson();

    Person updatePerson();

    void deletePerson();

}
