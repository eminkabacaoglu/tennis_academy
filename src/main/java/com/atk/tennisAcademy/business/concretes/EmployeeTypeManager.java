package com.atk.tennisAcademy.business.concretes;

import com.atk.tennisAcademy.business.abstracts.EmployeeTypeService;
import com.atk.tennisAcademy.dataAccess.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeTypeManager implements EmployeeTypeService {
    @Autowired
    EmployeeRepository employeeRepository;
}
