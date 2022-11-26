package com.atk.tennisAcademy.dataAccess;

import com.atk.tennisAcademy.entities.MembershipStatus;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StatusRepositoryTest {
    @Autowired
    private  StatusRepository statusRepository;

    @Test
    public void saveStatus(){
        MembershipStatus status = MembershipStatus.builder()
                .statusName("Faal")
                .build();
        statusRepository.save(status);

    }
}