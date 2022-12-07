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

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public boolean deleteEmployee(Long id) {
        try {
            employeeRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        //Employee foundEmployee = getEmployeeById(id);
        //foundEmployee =employee;// ??
        employeeRepository.save(employee);
        return employee;
    }
}
