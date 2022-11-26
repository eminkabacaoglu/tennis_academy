package com.atk.tennisAcademy.dataAccess;

import com.atk.tennisAcademy.entities.Parent;
import com.atk.tennisAcademy.entities.Person;
import com.atk.tennisAcademy.entities.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private  StudentRepository studentRepository;
    @Autowired
    private MemberRepository memberRepository;

    @Test
    public  void saveStudent(){
//        Parent parent = Parent.builder()
//                .firstName("ayşe")
//                .lastName("fazlı")
//                .dateOfBirth(LocalDate.parse("1955-02-02"))
//                .username("ayse123")
//                .password("9999")
//                .gender(Person.Gender.Female)
//                .job("ogretmen")
//                .build();
//        Parent parent2 = Parent.builder()
//                .firstName("asuda")
//                .lastName("celebi")
//                .dateOfBirth(LocalDate.parse("1955-02-02"))
//                .username("nur2")
//                .password("9999")
//                .gender(Person.Gender.Female)
//                .job("ogretmen")
//                .build();

        Student student = Student.builder()
                .firstName("niyazi")
                .lastName("savas")
                .username("niyazi")
                .school("Ataturk Lisesi")
                .password("12345")
                .placeOfBirth("giresun")
                .nationalId("888888")
                .gender(Person.Gender.Male)
                .dateOfBirth(LocalDate.parse("1986-12-12"))
                        .build();

//        student.addParent(parentRepository.findById(1L).get());
        student.addParent(memberRepository.findById(2L).get());
//        student.addParent(parent);
//        student.addParent(parent2);
        studentRepository.save(student);

    }

}