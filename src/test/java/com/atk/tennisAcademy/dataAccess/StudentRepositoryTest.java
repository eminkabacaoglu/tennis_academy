package com.atk.tennisAcademy.dataAccess;

import com.atk.tennisAcademy.entities.Parent;
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
    private ParentRepository parentRepository;

    @Test
    public  void saveStudent(){
//        Parent parent = Parent.builder()
//                .firstName("nursel")
//                .lastName("kabacaoglu")
//                .dateOfBirth(LocalDate.parse("1955-02-02"))
//                .username("nur")
//                .password("9999")
//                .isActive(true)
//                .job("ogretmen")
//                .build();
//        Parent parent2 = Parent.builder()
//                .firstName("asuda")
//                .lastName("celebi")
//                .dateOfBirth(LocalDate.parse("1955-02-02"))
//                .username("nur")
//                .password("9999")
//                .isActive(true)
//                .job("ogretmen")
//                .build();
        Student student = Student.builder()
                .firstName("can")
                .lastName("celebi")
                .username("can")
                .school("Ataturk Lisesi")
                .password("12345")
                .placeOfBirth("giresun")
                .isActive(true)
                .dateOfBirth(LocalDate.parse("1986-02-02"))
                        .build();

        student.addParent(parentRepository.findById(1L).get());
        student.addParent(parentRepository.findById(2L).get());
//        student.addParent(parent);
//        student.addParent(parent2);
        studentRepository.save(student);

    }

}