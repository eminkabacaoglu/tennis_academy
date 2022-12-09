package com.atk.tennisAcademy.business.abstracts;

import com.atk.tennisAcademy.entities.FieldType;

import java.util.List;

public interface FieldTypeService {
    List<FieldType> getAllFieldTypes();
    FieldType getFieldTypeById(Long id);
    FieldType saveFieldType(FieldType fieldType);
    boolean deleteFieldType(Long id);
    FieldType updateFieldType(Long id , FieldType fieldType);
}
