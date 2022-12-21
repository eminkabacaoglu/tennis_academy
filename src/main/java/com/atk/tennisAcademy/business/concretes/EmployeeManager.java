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
        Employee foundEmployee = getEmployeeById(id);
        if(foundEmployee != null){
            foundEmployee.setFirstName(employee.getFirstName());
            foundEmployee.setLastName(employee.getLastName());
            foundEmployee.setUsername(employee.getUsername());
            foundEmployee.setPassword(employee.getPassword());
            foundEmployee.setNationalId(employee.getNationalId());
            foundEmployee.setDateOfBirth(employee.getDateOfBirth());
            foundEmployee.setPlaceOfBirth(employee.getPlaceOfBirth());
            foundEmployee.setMobilePhone(employee.getMobilePhone());
            foundEmployee.setHomePhone(employee.getHomePhone());
            foundEmployee.setEmail(employee.getEmail());
            foundEmployee.setGender(employee.getGender());
            foundEmployee.setPhotoUrl(employee.getPhotoUrl());
            foundEmployee.setEmployeeType(employee.getEmployeeType());
            foundEmployee.setDriverLicense(employee.getDriverLicense());
            foundEmployee.setMarried(employee.isMarried());
            foundEmployee.setActive(employee.isActive());
            foundEmployee.setWebReservation(employee.isWebReservation());
            foundEmployee.setModifiedBy(employee.getModifiedBy());

            return employeeRepository.save(foundEmployee);
        }else {
            return null;
        }


    }
}
