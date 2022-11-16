package com.atk.tennisAcademy.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Table(name = "employees")
public class Employee extends Person{
    private String employeeNo;

    @Builder
    public Employee(String firstName, String lastName, String username, String password, String nationalId, LocalDate dateOfBirth, String placeOfBirth,  Gender gender, String employeeNo) {
        super(firstName, lastName, username, password, nationalId, dateOfBirth, placeOfBirth, gender);
        this.employeeNo = employeeNo;
    }
}
