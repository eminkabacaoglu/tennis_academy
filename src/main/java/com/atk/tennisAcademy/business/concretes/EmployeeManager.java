package com.atk.tennisAcademy.business.concretes;

import com.atk.tennisAcademy.business.abstracts.EmployeeService;
import com.atk.tennisAcademy.dataAccess.EmployeeRepository;
import com.atk.tennisAcademy.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeManager implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
