package com.atk.tennisAcademy.business.concretes;

import com.atk.tennisAcademy.business.abstracts.EmployeeService;
import com.atk.tennisAcademy.dataAccess.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeManager implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
}
