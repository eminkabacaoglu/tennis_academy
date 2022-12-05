package com.atk.tennisAcademy.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "student_types")
public class StudentType extends PersonType{
    @Builder
    public StudentType(Long id, String typeCode, String description) {
        super(id, typeCode, description);
    }
}
