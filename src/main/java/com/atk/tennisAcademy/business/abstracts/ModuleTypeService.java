package com.atk.tennisAcademy.business.abstracts;

import com.atk.tennisAcademy.entities.ModuleType;

import java.util.List;

public interface ModuleTypeService {
    List<ModuleType> getAllModuleTypes();
    ModuleType getModuleTypeById(Long id);
    ModuleType saveModuleType(ModuleType moduleType);
    boolean deleteModuleType(Long id);
    ModuleType updateModuleType(Long id , ModuleType moduleType);
}
