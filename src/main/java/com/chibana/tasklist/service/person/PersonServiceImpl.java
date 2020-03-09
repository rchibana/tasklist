package com.chibana.tasklist.service.person;

import com.chibana.tasklist.model.Person;
import com.chibana.tasklist.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Rodrigo Chibana
 * Date: 09/03/2020
 **/
@Service
public class PersonServiceImpl implements PersonService {

    private PersonRepository personRepository;

    public PersonServiceImpl(@Autowired  final PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Person createPerson() {
        return null;
    }

    @Override
    public Person getPerson() {
        return null;
    }

    @Override
    public Person updatePerson() {
        return null;
    }

    @Override
    public void deletePerson() {

    }
}
