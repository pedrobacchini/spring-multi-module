package com.github.pedrobacchini.service;

import com.github.pedrobacchini.repository.Person;
import com.github.pedrobacchini.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) { this.personRepository = personRepository; }

    public List<Person> getAllPerson() { return personRepository.findAll(); }
}
