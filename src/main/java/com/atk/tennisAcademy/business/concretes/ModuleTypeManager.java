package com.atk.tennisAcademy.business.concretes;

import com.atk.tennisAcademy.business.abstracts.ModuleTypeService;
import com.atk.tennisAcademy.dataAccess.ModuleTypeRepository;
import com.atk.tennisAcademy.entities.Level;
import com.atk.tennisAcademy.entities.ModuleType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ModuleTypeManager implements ModuleTypeService {

    @Autowired
    ModuleTypeRepository moduleTypeRepository;
    @Override
    public List<ModuleType> getAllModuleTypes() {
        return moduleTypeRepository.findAll();
    }

    @Override
    public ModuleType getModuleTypeById(Long id) {
        return moduleTypeRepository.findById(id).orElse(null);
    }

    @Override
    public ModuleType saveModuleType(ModuleType moduleType) {
        return moduleTypeRepository.save(moduleType);
    }

    @Override
    public boolean deleteModuleType(Long id) {
        try {
            moduleTypeRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public ModuleType updateModuleType(Long id, ModuleType moduleType) {
        ModuleType foundModuleType = getModuleTypeById(id);
        if(foundModuleType!=null){
            foundModuleType.setModuleDescription(moduleType.getModuleDescription());
            foundModuleType.setModifiedBy(moduleType.getModifiedBy());
            moduleTypeRepository.save(foundModuleType);
            return foundModuleType;
        }
        else{
            return null;
        }
    }
}
