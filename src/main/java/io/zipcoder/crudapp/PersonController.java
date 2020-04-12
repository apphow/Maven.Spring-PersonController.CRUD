package io.zipcoder.crudapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//https://github.com/froilan-miranda/Demo-Simple-Spring-Web-MVC/blob/master/src/main/java/com/zipcode/demo/WebMVC/controllers/CarController.java
@RestController
public class PersonController {

    private PersonRepository personRepository;

    @Autowired
    public void PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/person{id}")
   public Person getPerson(@PathVariable int id) {
        return personRepository.findById(id);
    }



   // Person updatePerson(Person p){}
   // void DeletePerson(int id{}

}

