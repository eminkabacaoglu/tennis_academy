package com.atk.tennisAcademy.business.concretes;

import com.atk.tennisAcademy.business.abstracts.FieldTypeService;
import com.atk.tennisAcademy.dataAccess.FieldTypeRepository;
import com.atk.tennisAcademy.entities.FieldType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FieldTypeManager implements FieldTypeService {

    @Autowired
    FieldTypeRepository fieldTypeRepository;

    @Override
    public List<FieldType> getAllFieldTypes() {
        return fieldTypeRepository.findAll();
    }

    @Override
    public FieldType getFieldTypeById(Long id) {
        return fieldTypeRepository.findById(id).orElse(null);
    }

    @Override
    public FieldType saveFieldType(FieldType fieldType) {
        return fieldTypeRepository.save(fieldType);
    }

    @Override
    public boolean deleteFieldType(Long id) {
        try {
           fieldTypeRepository.deleteById(id);
           return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public FieldType updateFieldType(Long id, FieldType fieldType) {
        FieldType foundFieldType = getFieldTypeById(id);
        if(foundFieldType!=null){
            foundFieldType.setFieldTypeCode(fieldType.getFieldTypeCode());
            foundFieldType.setFieldTypeDescription(fieldType.getFieldTypeDescription());
            foundFieldType.setModifiedBy(fieldType.getModifiedBy());
            fieldTypeRepository.save(foundFieldType);
            return foundFieldType;
        }
        else{
            return null;
        }
    }
}
