package com.atk.tennisAcademy.entities;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.security.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@Table(name = "student_types")
public class StudentType extends PersonType {
    @Builder
    public StudentType(Long id, String typeCode, String description, Date createdAt, Date lastModifiedAt, String createdBy,String modifiedBy) {
        super(id, typeCode, description,createdAt,lastModifiedAt, createdBy,modifiedBy);
    }
}
