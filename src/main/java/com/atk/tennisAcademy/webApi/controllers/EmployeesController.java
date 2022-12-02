package com.atk.tennisAcademy.webApi.controllers;

import com.atk.tennisAcademy.business.abstracts.EmployeeService;
import com.atk.tennisAcademy.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/employees")
public class EmployeesController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/getall")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
}
