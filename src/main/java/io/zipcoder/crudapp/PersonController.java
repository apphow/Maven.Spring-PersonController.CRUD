package io.zipcoder.crudapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

//https://github.com/froilan-miranda/Demo-Simple-Spring-Web-MVC/blob/master/src/main/java/com/zipcode/demo/WebMVC/controllers/CarController.java
@RestController
public class PersonController {

    private PersonRepository personRepository;

    @Autowired
    public void PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Optional<Person> findById(int id) {
        return this.personRepository.findById(id);
    }
}

