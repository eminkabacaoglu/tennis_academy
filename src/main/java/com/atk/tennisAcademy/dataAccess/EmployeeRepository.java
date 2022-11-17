package com.atk.tennisAcademy.dataAccess;

import com.atk.tennisAcademy.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
