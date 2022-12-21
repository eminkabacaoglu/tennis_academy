package com.atk.tennisAcademy.dataAccess;

import com.atk.tennisAcademy.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City,Long> {
}
