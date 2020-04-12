package io.zipcoder.crudapp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

//https://github.com/Zipcoder/SpringBootWithUnitTest/blob/master/src/main/java/com/example/demo/service/UserService.java
@Repository
interface PersonRepository extends CrudRepository<Person, Integer> {

    Person findById(int id);

    List<Person> findAll();
    List<String> list = new ArrayList<String>();
    Person findOne(int id);

    Person save (Person person);

    void delete(int id);
}
