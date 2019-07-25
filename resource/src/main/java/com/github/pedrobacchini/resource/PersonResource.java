package com.github.pedrobacchini.resource;

import com.github.pedrobacchini.repository.Person;
import com.github.pedrobacchini.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonResource {

    private final PersonService personService;

    public PersonResource(PersonService personService) { this.personService = personService; }

    @GetMapping
    public List<Person> getAllPerson() { return personService.getAllPerson(); }
}
