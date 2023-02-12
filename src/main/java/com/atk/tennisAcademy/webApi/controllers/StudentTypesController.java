package com.atk.tennisAcademy.webApi.controllers;

import com.atk.tennisAcademy.business.abstracts.StudentTypeService;
import com.atk.tennisAcademy.entities.StudentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/studenttypes")
public class StudentTypesController {

    @Autowired
    StudentTypeService studentTypeService;

    @GetMapping
    public List<StudentType> getAllStudentTypes(){
        return studentTypeService.getAllStudentTypes();
    }

    @GetMapping("/{id}")
    public StudentType getStudentbyId(@PathVariable Long id){
        return studentTypeService.getStudentTypeById(id);
    }

    @PostMapping
    public StudentType saveStudentType(@RequestBody StudentType studentType){
        return studentTypeService.saveStudentType(studentType);
    }

    @DeleteMapping("/{id}")
    public boolean deleteStudentType(@PathVariable Long id){
        return studentTypeService.deleteStudentType(id);
    }

    @PutMapping("/{id}")
    public StudentType updateStudentType(@PathVariable Long id,@RequestBody StudentType studentType){
        return studentTypeService.updateStudentType(id,studentType);
    }
}
