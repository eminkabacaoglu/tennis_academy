package com.atk.tennisAcademy.business.concretes;

import com.atk.tennisAcademy.business.abstracts.CountryService;
import com.atk.tennisAcademy.dataAccess.CountryRepository;
import com.atk.tennisAcademy.entities.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryManager implements CountryService {

    @Autowired
    CountryRepository countryRepository;

    @Override
    public List<Country> getAllCountries() {
        return null;
    }

    @Override
    public Country getCountryById(Long id) {
        return null;
    }

    @Override
    public Country saveCountry(Country country) {
        return null;
    }

    @Override
    public Country updateCountry(Long id, Country country) {
        return null;
    }

    @Override
    public boolean deleteCountry(Long id) {
        return false;
    }
}
