package com.atk.tennisAcademy.webApi.controllers;
import com.atk.tennisAcademy.business.abstracts.LockerService;
import com.atk.tennisAcademy.entities.Locker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lockers")
@CrossOrigin(origins = "http://localhost:4200")
public class LockersController {

    @Autowired
    LockerService lockerService;

    @GetMapping
    public List<Locker> getAlLockera(){
        return lockerService.getAllLockers();
    }

    @GetMapping("/{id}")
    public Locker getLockerById(@PathVariable Long id){
        return lockerService.getLockerById(id);
    }

    @PostMapping
    public Locker saveLocker(@RequestBody  Locker locker){
        return lockerService.saveLocker(locker);
    }

    @DeleteMapping("/{id}")
    public boolean deleteLocker(@PathVariable Long id){
        return lockerService.deleteLocker(id);
    }

    @PutMapping("/{id}")
    public Locker updateLocker(@PathVariable Long id, @RequestBody Locker locker){
        return lockerService.updateLocker(id,locker);
    }
}
