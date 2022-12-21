package com.atk.tennisAcademy.business.concretes;

import com.atk.tennisAcademy.business.abstracts.EmployeeTypeService;
import com.atk.tennisAcademy.dataAccess.EmployeeTypeRepository;
import com.atk.tennisAcademy.entities.EmployeeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeTypeManager implements EmployeeTypeService {
    @Autowired
    EmployeeTypeRepository employeeTypeRepository;

    @Override
    public List<EmployeeType> getAllEmployeeTypes() {
        return employeeTypeRepository.findAll();
    }

    @Override
    public EmployeeType saveEmployeeType(EmployeeType employeeType) {
        return employeeTypeRepository.save(employeeType);
    }

    @Override
    public boolean deleteEmployeeType(Long id) {
        try {
            employeeTypeRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public EmployeeType getEmployeeTypeById(Long id) {
        return employeeTypeRepository.findById(id).orElse(null);
    }

    @Override
    public EmployeeType updateEmployeeType(Long id, EmployeeType employeeType) {
        EmployeeType foundEmployeeType = getEmployeeTypeById(id);
        if (foundEmployeeType != null){
            foundEmployeeType.setTypeCode(employeeType.getTypeCode());
            foundEmployeeType.setDescription(employeeType.getDescription());
            foundEmployeeType.setModifiedBy(employeeType.getModifiedBy());
            employeeTypeRepository.save(foundEmployeeType);
            return foundEmployeeType;
        }else{
            return null;
        }


    }
}
