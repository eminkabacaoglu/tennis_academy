package com.atk.tennisAcademy.business.abstracts;

import com.atk.tennisAcademy.entities.MemberType;
import com.atk.tennisAcademy.entities.StudentType;

import java.util.List;

public interface StudentTypeService {
    List<StudentType> getAllStudentTypes();

    StudentType saveStudentType(StudentType studentType);

    boolean deleteStudentType(Long id);
}
