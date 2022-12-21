package com.atk.tennisAcademy.business.concretes;

import com.atk.tennisAcademy.business.abstracts.FieldService;
import com.atk.tennisAcademy.dataAccess.FieldRepository;
import com.atk.tennisAcademy.entities.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FieldManager implements FieldService {

    @Autowired
    FieldRepository fieldRepository;

    @Override
    public List<Field> getAllFields() {
        return fieldRepository.findAll();
    }

    @Override
    public Field getFieldById(Long id) {
        return fieldRepository.findById(id).orElse(null);
    }

    @Override
    public Field saveField(Field field) {
        return fieldRepository.save(field);
    }

    @Override
    public boolean deleteField(Long id) {
        try {
            fieldRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public Field updateField(Long id, Field field) {
        Field foundField = getFieldById(id);
        if(foundField != null){
            foundField.setFieldCode(field.getFieldCode());
            foundField.setFieldDescription(field.getFieldDescription());
            foundField.setFieldType(field.getFieldType());
            foundField.setActive(field.isActive());
            foundField.setWebActive(field.isWebActive());
            foundField.setModifiedBy(field.getModifiedBy());
            return fieldRepository.save(foundField);
        } else{
            return null;
        }
    }
}
