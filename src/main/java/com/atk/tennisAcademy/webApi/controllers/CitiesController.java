package com.atk.tennisAcademy.webApi.controllers;

import com.atk.tennisAcademy.business.abstracts.CityService;
import com.atk.tennisAcademy.entities.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/cities")
public class CitiesController {

    @Autowired
    CityService cityService;

    @GetMapping
    public List<City> getAllCities(){
        return cityService.getAllCities();
    }

    @GetMapping("/{id}")
    public City getCityById(@PathVariable Long id){
        return cityService.getCityById(id);
    }


    @PutMapping("/{id}")
    public City updateCity(@PathVariable Long id,@RequestBody City city){
        return cityService.updateCity(id,city);
    }



    @DeleteMapping("/{id}")
    public boolean deleteCity(@PathVariable Long id){
        return cityService.deleteCity(id);
    }
}
