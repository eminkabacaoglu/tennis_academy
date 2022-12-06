package com.atk.tennisAcademy.business.abstracts;

import com.atk.tennisAcademy.entities.EmployeeType;

import java.util.List;

public interface EmployeeTypeService {
    List<EmployeeType> getAllEmployeeTypes();
    EmployeeType saveEmployeeType(EmployeeType employeeType);
    boolean deleteEmployeeType(Long id);

    EmployeeType getEmployeeTypeById(Long id);
}
