package com.atk.tennisAcademy.dataAccess;

import com.atk.tennisAcademy.entities.Member;
import com.atk.tennisAcademy.entities.MemberType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class MemberRepositoryTest {

    @Autowired
    private  MemberRepository memberRepository;
    @Autowired
    private  StatusRepository statusRepository;

    @Autowired
    private MemberTypeRepository memberTypeRepository;

    @Test
    public void saveMember(){
        MemberType mt = MemberType.builder()
                .typeCode("U")
                .description("Üye")
                .build();
        memberTypeRepository.save(mt);
        Member member = Member.builder()
                .firstName("Ali")
                .lastName("Dogan")
                .username("alid")
//                .membershipStatus(statusRepository.findById(1L).get())
                .memberType(mt)
                .build();
        memberRepository.save(member);

    }

    @Test
    public void updateMember(){
        Long memberId=1L;
        Member member = Member.builder()
                .firstName("Cihan")
                .lastName("Ünal")
                .membershipStatus(statusRepository.findById(1L).get())
                .build();
        Optional<Member> memberById = memberRepository.findById(memberId);
        if(memberById.isPresent()){
            Member foundMember = memberById.get();
            foundMember.setFirstName(member.getFirstName());
            foundMember.setLastName(member.getLastName());
            foundMember.setUsername(member.getUsername());

            memberRepository.save(foundMember);

        }


    }

}