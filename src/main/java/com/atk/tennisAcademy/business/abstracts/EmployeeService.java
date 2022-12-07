package com.atk.tennisAcademy.business.abstracts;
import com.atk.tennisAcademy.entities.Employee;
import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    Employee saveEmployee(Employee employee);
    boolean deleteEmployee(Long id);
    Employee updateEmployee(Long id , Employee employee);
}
