package com.atk.tennisAcademy.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "fields")
public class Field {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fieldCode;
    private String fieldName;
    private String fieldDescription;
    private boolean isActive = true;
    private boolean isWebActive = true;

    @ManyToOne()
    @JoinColumn(name = "field_type_id")
    private FieldType fieldType;
}
