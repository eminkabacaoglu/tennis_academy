package com.atk.tennisAcademy.dataAccess;

import com.atk.tennisAcademy.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Person, Long> {

    Person findByUsernameAndPassword(String username,String password);
}
