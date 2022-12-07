package com.atk.tennisAcademy.business.concretes;

import com.atk.tennisAcademy.business.abstracts.StudentService;
import com.atk.tennisAcademy.dataAccess.StudentRepository;
import com.atk.tennisAcademy.entities.Employee;
import com.atk.tennisAcademy.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentManager implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public boolean deleteStudent(Long id) {
        try {
            studentRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        Student foundStudent = getStudentById(id);
        foundStudent.setFirstName(student.getFirstName());
        foundStudent.setLastName(student.getLastName());
        foundStudent =student;
        studentRepository.save(foundStudent);
        return foundStudent;
    }


}
