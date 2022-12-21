package com.atk.tennisAcademy.business.abstracts;

import com.atk.tennisAcademy.entities.City;

import java.util.List;

public interface CityService {

    List<City> getAllCities();
    City getCityById(Long id);
    City saveCity(City city);
    City updateCity(Long id, City city);
    boolean deleteCity(Long id);
}
