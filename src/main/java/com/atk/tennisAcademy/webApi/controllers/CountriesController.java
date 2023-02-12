package com.atk.tennisAcademy.webApi.controllers;

import com.atk.tennisAcademy.business.abstracts.CountryService;
import com.atk.tennisAcademy.entities.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/countries")
public class CountriesController {
    @Autowired
    CountryService countryService;

    @GetMapping
    public List<Country> getAllCounties(){
        return countryService.getAllCountries();
    }

    @GetMapping("/{id}")
    public Country getCountyById(@PathVariable Long id){
        return countryService.getCountryById(id);
    }


    @PutMapping("/{id}")
    public Country updateCounty(@PathVariable Long id,@RequestBody Country county){
        return countryService.updateCountry(id,county);
    }


    @DeleteMapping("/{id}")
    public boolean deleteCounty(@PathVariable Long id){
        return countryService.deleteCountry(id);
    }
}
