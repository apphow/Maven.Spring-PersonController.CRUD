package io.zipcoder.crudapp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//https://github.com/Zipcoder/SpringBootWithUnitTest/blob/master/src/main/java/com/example/demo/service/UserService.java
@Repository
public interface Repositories extends CrudRepository<Person, Long> {

    List<Person> findAll();

    List<Person> findById(int id);

    void create(Person person);

    void update(Person person);

    void delete(int id);

}
