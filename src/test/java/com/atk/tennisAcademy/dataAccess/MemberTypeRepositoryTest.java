package com.atk.tennisAcademy.dataAccess;

import com.atk.tennisAcademy.business.abstracts.PaymentTypeService;
import com.atk.tennisAcademy.entities.MemberType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberTypeRepositoryTest {
    @Autowired
    MemberTypeRepository memberTypeRepository;
    @Autowired
    PaymentTypeService paymentTypeService;
    @Test
    public void saveMemberType(){
        MemberType memberType = MemberType.builder()
                .typeCode("New")
                .description("New Yeni")
                .paymentType(paymentTypeService.getPaymentTypeById(1L))
                .build();
        memberTypeRepository.save(memberType);

    }
}