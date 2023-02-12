package com.atk.tennisAcademy.webApi.controllers;

import com.atk.tennisAcademy.business.abstracts.CountyService;
import com.atk.tennisAcademy.entities.County;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/counties")
public class CountiesController {

    @Autowired
    CountyService countyService;

    @GetMapping
    public List<County> getAllCounties(){
        return countyService.getAllCounties();
    }

    @GetMapping("/{id}")
    public County getCountyById(@PathVariable Long id){
        return countyService.getCountyById(id);
    }


    @PutMapping("/{id}")
    public County updateCounty(@PathVariable Long id,@RequestBody County county){
        return countyService.updateCounty(id,county);
    }



    @DeleteMapping("/{id}")
    public boolean deleteCounty(@PathVariable Long id){
        return countyService.deleteCounty(id);
    }
}
