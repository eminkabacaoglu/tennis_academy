package com.atk.tennisAcademy.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "employee_types")
@NoArgsConstructor
@Data
public class EmployeeType extends PersonType{
    @Builder
    public EmployeeType(Long id, String typeCode, String description) {
        super(id, typeCode, description);
    }
}
