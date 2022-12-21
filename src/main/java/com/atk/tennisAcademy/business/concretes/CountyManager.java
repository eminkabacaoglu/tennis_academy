package com.atk.tennisAcademy.business.concretes;

import com.atk.tennisAcademy.business.abstracts.CountyService;
import com.atk.tennisAcademy.dataAccess.CountyRepository;
import com.atk.tennisAcademy.entities.County;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountyManager implements CountyService {

    @Autowired
    CountyRepository countyRepository;

    @Override
    public List<County> getAllCounties() {
        return null;
    }

    @Override
    public County getCountyById(Long id) {
        return null;
    }

    @Override
    public County saveCounty(County county) {
        return null;
    }

    @Override
    public County updateCounty(Long id, County county) {
        return null;
    }

    @Override
    public boolean deleteCounty(Long id) {
        return false;
    }
}
