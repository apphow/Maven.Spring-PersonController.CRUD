package io.zipcoder.crudapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//https://github.com/froilan-miranda/Demo-Simple-Spring-Web-MVC/blob/master/src/main/java/com/zipcode/demo/WebMVC/controllers/CarController.java
//https://medium.com/@abedxh/crud-using-spring-boot-part-1-without-db-385a48e8578b
@RestController
public class PersonController {

    private PersonRepository personRepository;

    @Autowired
    public void PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/person{id}")
    public Person getPerson(@PathVariable("id") int id) {
        return personRepository.findById(id);
    }

    @PostMapping
    public ResponseEntity<Object> createPerson(@RequestBody Person person) {

        return ResponseEntity.status(HttpStatus.MULTI_STATUS.INTERNAL_SERVER_ERROR).build();
    }

    @GetMapping
    public List<Person> getPersonList() {
        return personRepository.findAll();
    }

    @PutMapping
    public ResponseEntity<Object> updatePerson(@RequestBody Person person, @PathVariable int id){
        Optional<Person> existingPerson = Optional.ofNullable(personRepository.findById(id));
        person.setLastName("Smith");
        return ResponseEntity.status(HttpStatus.MULTI_STATUS.INTERNAL_SERVER_ERROR).build();
    }

    @DeleteMapping
    public ResponseEntity<Object> delete(@PathVariable int id) {
        personRepository.delete(id);
        return ResponseEntity.ok().build();
    }
}


    /*
    http://javawebtutor.com/articles/spring/spring-mvc-hibernate-crud-example.php
    @DeleteMapping
    @RequestMapping(value = "/deletePerson", method = RequestMethod.GET)
    public ModelAndView deleteEmployee(HttpServletRequest request) {
        int personId = Integer.parseInt(request.getParameter("id"));
        personRepository.delete(getPerson(3));
        return new ModelAndView("redirect:/");

     */


//https://docs.microsoft.com/en-us/aspnet/web-api/overview/older-versions/creating-a-web-api-that-supports-crud-operations