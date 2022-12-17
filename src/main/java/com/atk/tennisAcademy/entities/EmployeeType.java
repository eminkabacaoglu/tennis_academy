package com.atk.tennisAcademy.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.security.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "employee_types")
@NoArgsConstructor
@Data
public class EmployeeType extends PersonType{
    @Builder
    public EmployeeType(Long id, String typeCode, String description, Date createdAt, Date lastModifiedAt, String createdBy,String modifiedBy) {

        super(id, typeCode, description,createdAt,lastModifiedAt, createdBy,modifiedBy);
    }
}
