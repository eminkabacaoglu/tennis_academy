package com.atk.tennisAcademy.dataAccess;

import com.atk.tennisAcademy.entities.EmployeeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeTypeRepository extends JpaRepository<EmployeeType,Long> {
}
