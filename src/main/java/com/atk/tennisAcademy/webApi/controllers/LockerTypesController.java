package com.atk.tennisAcademy.webApi.controllers;

import com.atk.tennisAcademy.business.abstracts.LockerTypeService;
import com.atk.tennisAcademy.entities.LockerType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lockertypes")
@CrossOrigin(origins = "http://localhost:4200")
public class LockerTypesController {

    @Autowired
    LockerTypeService lockerTypeService;

    @GetMapping
    public List<LockerType> getAlLockerTypes(){
        return lockerTypeService.getAllLockerTypes();
    }

    @GetMapping("/{id}")
    public LockerType getLockerTypeById(@PathVariable Long id){
        return lockerTypeService.getLockerTypeById(id);
    }

    @PostMapping
    public LockerType saveLockerType(@RequestBody  LockerType lockerType){
        return lockerTypeService.saveLockerType(lockerType);
    }

    @DeleteMapping("/id")
    public boolean deleteLockerType(@PathVariable Long id){
        return lockerTypeService.deleteLockerType(id);
    }

    @PutMapping("/{id}")
    public LockerType updateLockerType(@PathVariable Long id, @RequestBody LockerType lockerType){
        return lockerTypeService.updateLockerType(id,lockerType);
    }
}
