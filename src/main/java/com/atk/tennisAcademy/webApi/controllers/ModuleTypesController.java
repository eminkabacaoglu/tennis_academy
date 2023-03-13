package com.atk.tennisAcademy.webApi.controllers;
import com.atk.tennisAcademy.business.abstracts.ModuleTypeService;
import com.atk.tennisAcademy.entities.Level;
import com.atk.tennisAcademy.entities.ModuleType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/moduletypes")
@CrossOrigin(origins = "http://localhost:4200")
public class ModuleTypesController {

    @Autowired
    ModuleTypeService moduleTypeService;

    @GetMapping
    public List<ModuleType> getAllFieldTypes(){
        return moduleTypeService.getAllModuleTypes();
    }

    @GetMapping("/{id}")
    public ModuleType getFieldTypeById(@PathVariable Long id){
        return moduleTypeService.getModuleTypeById(id);
    }

    @PostMapping
    public ModuleType saveFieldType(@RequestBody ModuleType moduleType){
        return moduleTypeService.saveModuleType(moduleType);
    }

    @DeleteMapping("/id")
    public boolean deleteFieldType(@PathVariable Long id){
        return moduleTypeService.deleteModuleType(id);
    }

    @PutMapping("/{id}")
    public ModuleType updateFieldType(@PathVariable Long id, @RequestBody ModuleType moduleType){
        return moduleTypeService.updateModuleType(id,moduleType);
    }
}
