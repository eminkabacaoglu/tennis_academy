package com.atk.tennisAcademy.dataAccess;

import com.atk.tennisAcademy.entities.Parent;
import com.atk.tennisAcademy.entities.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class ParentRepositoryTest {
    @Autowired
    private  ParentRepository parentRepository;

    @Test
    public Parent parentByFirstId(Long parentId){

        return parentRepository.findById(parentId).get();

    }
    @Test
    public void saveParent(){
        Parent parent = Parent.builder()
                .firstName("Salih")
                .lastName("Kalkan")
                .gender(Person.Gender.Male)
                .username("skalkan")
                .password("11122233")
                .job("Mühendis")
                .build();
        parentRepository.save(parent);

    }


}