package com.atk.tennisAcademy.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Table(name = "employees")
public class Employee extends Person{
    private String employeeNo;
    private boolean marriageStatus=false;

    @ManyToOne
    @JoinColumn(name = "employee_type_id")
    private EmployeeType employeeType;

    @Builder
    public Employee(String firstName, String lastName, String username, String password, String nationalId, LocalDate dateOfBirth, String placeOfBirth, Gender gender, String employeeNo, EmployeeType employeeType) {
        super(firstName, lastName, username, password, nationalId, dateOfBirth, placeOfBirth, gender);
        this.employeeNo = employeeNo;
        this.employeeType = employeeType;
    }
}
