package com.chibana.tasklist.controller;

import com.chibana.tasklist.service.person.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Rodrigo Chibana
 * Date: 09/03/2020
 **/
@Controller
@RequestMapping("/person")
public class PersonController {

    private PersonService personService;

    public PersonController(@Autowired final PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/{id}")
    public String getPerson(@PathVariable String id) {
        return null;
    }

    @PutMapping
    public String createPerson() {
        return null;
    }

    @DeleteMapping
    public String deletePerson() {
        return null;
    }

    @PostMapping
    public String updatePerson() {
        return null;
    }

}
