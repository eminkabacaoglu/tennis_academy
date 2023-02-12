package com.atk.tennisAcademy.webApi.controllers;

import com.atk.tennisAcademy.business.abstracts.FieldTypeService;
import com.atk.tennisAcademy.entities.FieldType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fieldtypes")
@CrossOrigin(origins = "http://localhost:4200")
public class FieldTypesController {

    @Autowired
    FieldTypeService fieldTypeService;

    @GetMapping
    public List<FieldType> getAllFieldTypes(){
        return fieldTypeService.getAllFieldTypes();
    }

    @GetMapping("/{id}")
    public FieldType getFieldTypeById(@PathVariable Long id){
        return fieldTypeService.getFieldTypeById(id);
    }

    @PostMapping
    public FieldType saveFieldType(@RequestBody  FieldType fieldType){
        return fieldTypeService.saveFieldType(fieldType);
    }

    @DeleteMapping("/id")
    public boolean deleteFieldType(@PathVariable Long id){
        return fieldTypeService.deleteFieldType(id);
    }

    @PutMapping("/{id}")
    public FieldType updateFieldType(@PathVariable Long id, @RequestBody FieldType fieldType){
        return fieldTypeService.updateFieldType(id,fieldType);
    }

}
