package io.zipcoder.crudapp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//https://github.com/Zipcoder/SpringBootWithUnitTest/blob/master/src/main/java/com/example/demo/service/UserService.java
@Repository
interface PersonRepository extends CrudRepository<Person, Long> {
    Optional<Person> findById(int id);
}
