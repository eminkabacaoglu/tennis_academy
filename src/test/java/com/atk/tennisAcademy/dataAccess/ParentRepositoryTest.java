package com.atk.tennisAcademy.dataAccess;

import com.atk.tennisAcademy.entities.Parent;
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


}