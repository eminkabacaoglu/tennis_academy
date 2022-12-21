package com.atk.tennisAcademy.business.abstracts;

import com.atk.tennisAcademy.entities.County;

import java.util.List;

public interface CountyService {

    List<County> getAllCounties();
    County getCountyById(Long id);
    County saveCounty(County county);
    County updateCounty(Long id,County county);
    boolean deleteCounty(Long id);
}
