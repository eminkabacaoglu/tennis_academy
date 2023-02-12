package com.atk.tennisAcademy.webApi.controllers;

import com.atk.tennisAcademy.business.abstracts.EmployeeTypeService;
import com.atk.tennisAcademy.entities.EmployeeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
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

    @PostMapping
    public EmployeeType saveEmployeeType(@RequestBody EmployeeType employeeType){
        return employeeTypeService.saveEmployeeType(employeeType);
    }

    @PutMapping("/{id}")
    public EmployeeType updateEmployeeType(@PathVariable Long id, @RequestBody EmployeeType employeeType){
        return employeeTypeService.updateEmployeeType(id,employeeType);
    }

}
