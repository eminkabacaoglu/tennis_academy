package com.atk.tennisAcademy.webApi.controllers;

import com.atk.tennisAcademy.business.abstracts.FieldService;
import com.atk.tennisAcademy.entities.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fields")
@CrossOrigin(origins = "http://localhost:4200")
public class FieldsController {

    @Autowired
    FieldService fieldService;

    @GetMapping
    public List<Field> getAllFields(){
        return fieldService.getAllFields();
    }

    @GetMapping("/{id}")
    public Field getFieldById(@PathVariable Long id){
        return fieldService.getFieldById(id);
    }

    @PostMapping
    public Field saveFieldType(@RequestBody  Field fieldType){
        return fieldService.saveField(fieldType);
    }

    @DeleteMapping("/id")
    public boolean deleteField(@PathVariable Long id){
        return fieldService.deleteField(id);
    }

    @PutMapping("/{id}")
    public Field updateField(@PathVariable Long id, @RequestBody Field field){
        return fieldService.updateField(id,field);
    }
}
