package com.atk.tennisAcademy.dataAccess;

import com.atk.tennisAcademy.entities.City;
import com.atk.tennisAcademy.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City,Long> {

    
}
