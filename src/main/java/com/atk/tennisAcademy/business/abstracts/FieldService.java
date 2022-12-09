package com.atk.tennisAcademy.business.abstracts;

import com.atk.tennisAcademy.entities.Field;

import java.util.List;

public interface FieldService {
    List<Field> getAllFields();
    Field getFieldById(Long id);
    Field saveField(Field field);
    boolean deleteField(Long id);
    Field updateField(Long id , Field field);
}
