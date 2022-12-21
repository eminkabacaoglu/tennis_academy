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

    @Override
    public StudentType getStudentTypeById(Long id) {
        return studentTypeRepository.findById(id).orElse(null);
    }

    @Override
    public StudentType updateStudentType(Long id, StudentType studentType) {
        StudentType foundStudentType = getStudentTypeById(id);
        if(foundStudentType!=null){
            foundStudentType.setTypeCode(studentType.getTypeCode());
            foundStudentType.setDescription(studentType.getDescription());
            foundStudentType.setModifiedBy(studentType.getModifiedBy());
            studentTypeRepository.save(foundStudentType);
            return foundStudentType;
        }
        else{
            return null;
        }

    }
}
