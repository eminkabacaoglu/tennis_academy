package com.atk.tennisAcademy.business.abstracts;

import com.atk.tennisAcademy.entities.Country;

import java.util.List;

public interface CountryService {
    List<Country> getAllCountries();
    Country getCountryById(Long id);
    Country saveCountry(Country country);
    Country updateCountry(Long id,Country country);
    boolean deleteCountry(Long id);
}
