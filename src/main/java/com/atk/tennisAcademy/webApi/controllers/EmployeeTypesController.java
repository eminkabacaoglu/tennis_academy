package com.atk.tennisAcademy.webApi.controllers;

import com.atk.tennisAcademy.business.abstracts.EmployeeTypeService;
import com.atk.tennisAcademy.entities.EmployeeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/employeetypes")
public class EmployeeTypesController {

    @Autowired
    EmployeeTypeService employeeTypeService;

    @GetMapping
    public List<EmployeeType> getAllEmployeeTypes(){
        return employeeTypeService.getAllEmployeeTypes();
    }

    @GetMapping("/{id}")
    public EmployeeType getEmployeeById(@PathVariable Long id){
        return employeeTypeService.getEmployeeTypeById(id);
    }

    @DeleteMapping("{id}")
    public boolean deleteEmployee(@PathVariable Long id){
        return employeeTypeService.deleteEmployeeType(id);
    }

}
