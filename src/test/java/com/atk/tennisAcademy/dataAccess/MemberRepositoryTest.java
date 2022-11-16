package com.atk.tennisAcademy.dataAccess;

import com.atk.tennisAcademy.entities.Member;
import com.atk.tennisAcademy.entities.Status;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class MemberRepositoryTest {

    @Autowired
    private  MemberRepository memberRepository;
    @Autowired
    private  StatusRepository statusRepository;

    @Test
    public void saveMember(){
        Member member = Member.builder()
                .firstName("emin")
                .lastName("kabacaoglu")
                .username("eminkbc")
                .membershipStatus(statusRepository.findById(1L).get())
                .build();
        memberRepository.save(member);

    }
}