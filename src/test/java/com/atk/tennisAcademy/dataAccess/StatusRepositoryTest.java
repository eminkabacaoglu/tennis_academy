package com.atk.tennisAcademy.dataAccess;

import com.atk.tennisAcademy.entities.Parent;
import com.atk.tennisAcademy.entities.Person;
import com.atk.tennisAcademy.entities.Status;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StatusRepositoryTest {
    @Autowired
    private  StatusRepository statusRepository;

    @Test
    public void saveStatus(){
        Status status = Status.builder()
                .statusName("Faal")
                .build();
        statusRepository.save(status);

    }
}