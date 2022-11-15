package com.atk.tennisAcademy.dataAccess;

import com.atk.tennisAcademy.entities.Parent;
import com.atk.tennisAcademy.entities.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private  StudentRepository studentRepository;

    @Test
    public  void saveStudent(){
        Parent parent = Parent.builder()
                .firstName("nur")
                .lastName("durkaya")
                .dateOfBirth(LocalDate.parse("1955-02-02"))
                .username("nur")
                .password("9999")
                .isActive(true)
                .job("ogretmen")
                .build();
//        Parent parent2 = Parent.builder()
//                .firstName("mustafa")
//                .lastName("durkaya")
//                .dateOfBirth(LocalDate.parse("1955-02-02"))
//                .username("nur")
//                .password("9999")
//                .isActive(true)
//                .job("ogretmen")
//                .build();
        Student student = Student.builder()
                .firstName("goksu")
                .lastName("durkaya")
                .username("goksu")
                .school("Ataturk Lisesi")
                .password("12345")
                .placeOfBirth("giresun")
                .isActive(true)
                .dateOfBirth(LocalDate.parse("1986-02-02"))
                        .build();

        student.addParent(parent);
//        student.addParent(parent2);
        studentRepository.save(student);

    }

}