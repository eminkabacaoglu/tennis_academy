package com.atk.tennisAcademy.dataAccess;

import com.atk.tennisAcademy.entities.MemberType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberTypeRepositoryTest {
    @Autowired
    MemberTypeRepository memberTypeRepository;
    @Test
    public void saveMemberType(){
        MemberType memberType = MemberType.builder()
                .typeCode("ANT")
                .description("Antrenör")
                .build();
        memberTypeRepository.save(memberType);

    }
}