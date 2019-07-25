package com.github.pedrobacchini;

import com.github.pedrobacchini.repository.Person;
import com.github.pedrobacchini.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication(scanBasePackages = "com.github.pedrobacchini")
public class ResourceApplication implements CommandLineRunner {

    private final PersonRepository personRepository;

    public ResourceApplication(PersonRepository personRepository) { this.personRepository = personRepository; }

    public static void main(String[] args) { SpringApplication.run(ResourceApplication.class, args); }

    @Override
    public void run(String... args) {
        Person person1 = new Person(1L, "Pedro", "Bacchini");
        Person person2 = new Person(2L, "Maria", "Silva");

        personRepository.saveAll(Arrays.asList(person1, person2));
    }
}
