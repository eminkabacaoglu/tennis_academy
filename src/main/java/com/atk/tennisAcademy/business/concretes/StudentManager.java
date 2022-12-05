package com.atk.tennisAcademy.business.concretes;

import com.atk.tennisAcademy.business.abstracts.StudentService;
import com.atk.tennisAcademy.dataAccess.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentManager implements StudentService {
    @Autowired
    StudentRepository studentRepository;
}
