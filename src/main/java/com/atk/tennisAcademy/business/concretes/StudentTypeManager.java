package com.atk.tennisAcademy.business.concretes;

import com.atk.tennisAcademy.business.abstracts.StudentTypeService;
import com.atk.tennisAcademy.dataAccess.StudentTypeRepository;
import com.atk.tennisAcademy.entities.StudentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentTypeManager implements StudentTypeService {

    @Autowired
    StudentTypeRepository studentTypeRepository;

    @Override
    public List<StudentType> getAllStudentTypes() {
        return studentTypeRepository.findAll();
    }

    @Override
    public StudentType saveStudentType(StudentType studentType) {
        return studentTypeRepository.save(studentType);
    }

    @Override
    public boolean deleteStudentType(Long id) {
        try {
            studentTypeRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
