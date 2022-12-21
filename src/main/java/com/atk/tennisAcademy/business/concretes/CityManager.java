package com.atk.tennisAcademy.business.concretes;

import com.atk.tennisAcademy.business.abstracts.CityService;
import com.atk.tennisAcademy.dataAccess.CityRepository;
import com.atk.tennisAcademy.entities.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityManager implements CityService {

    @Autowired
    CityRepository cityRepository;

    @Override
    public List<City> getAllCities() {
        return cityRepository.findAll();
    }

    @Override
    public City getCityById(Long id) {
        return cityRepository.findById(id).orElse(null);
    }

    @Override
    public City saveCity(City city) {
        return cityRepository.save(city);
    }

    @Override
    public City updateCity(Long id, City city) {
        City foundCity = getCityById(id);
        if(foundCity != null){
            foundCity.setCityName(city.getCityName());
            foundCity.setCountry(city.getCountry());
            foundCity.setModifiedBy(city.getModifiedBy());
            return cityRepository.save(foundCity);
        }else {
            return null;
        }


    }

    @Override
    public boolean deleteCity(Long id) {
        try {
            cityRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }

    }
}
