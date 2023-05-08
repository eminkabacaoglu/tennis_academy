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
        if(foundStudent != null){
            foundStudent.setFirstName(student.getFirstName());
            foundStudent.setLastName(student.getLastName());
            foundStudent.setUsername(student.getUsername());
            foundStudent.setPassword(student.getPassword());
            foundStudent.setNationalId(student.getNationalId());
            foundStudent.setCity(student.getCity());
            foundStudent.setDateOfBirth(student.getDateOfBirth());
            foundStudent.setDateOfRegistration(student.getDateOfRegistration());
            foundStudent.setPlaceOfBirth(student.getPlaceOfBirth());
            foundStudent.setMobilePhone(student.getMobilePhone());
            foundStudent.setHomePhone(student.getHomePhone());
            foundStudent.setEmail(student.getEmail());
            foundStudent.setGender(student.getGender());
            foundStudent.setPhotoUrl(student.getPhotoUrl());
            foundStudent.setSchool(student.getSchool());
            foundStudent.setAttendanceType(student.getAttendanceType());
            foundStudent.setStudentType(student.getStudentType());
            foundStudent.setMembers(student.getMembers());
            foundStudent.setActive(student.isActive());
            foundStudent.setWebReservation(student.isWebReservation());
            foundStudent.setModifiedBy(student.getModifiedBy());
            foundStudent.setInBlacklist(student.isInBlacklist());
            foundStudent.setBlackListDescription(student.getBlackListDescription());
            foundStudent.setAlternativeParent(student.getAlternativeParent());
            foundStudent.setParentJob(student.getParentJob());
            foundStudent.setParentNameSurname(student.getParentNameSurname());
            foundStudent.setParentWorkPlace(student.getParentWorkPlace());

            return studentRepository.save(foundStudent);
        }else {
            return null;
        }

    }


}
