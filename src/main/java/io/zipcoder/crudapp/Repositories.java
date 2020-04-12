package io.zipcoder.crudapp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//https://github.com/Zipcoder/SpringBootWithUnitTest/blob/master/src/main/java/com/example/demo/service/UserService.java
@Repository
interface PersonRepository extends CrudRepository<Person, Integer> {

    Person findById(int id);

    List<Person> findAll();

    Person findOne(int id);

    Object save (Person person);

    void delete(int id);
}
