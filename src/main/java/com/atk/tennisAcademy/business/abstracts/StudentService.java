package com.atk.tennisAcademy.business.abstracts;

import com.atk.tennisAcademy.entities.Employee;
import com.atk.tennisAcademy.entities.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();
    Student getStudentById(Long id);
    Student saveStudent(Student student);
    boolean deleteStudent(Long id);
    Student updateStudent(Long id, Student student);
}
