package com.atk.tennisAcademy.dataAccess;

import com.atk.tennisAcademy.entities.ModuleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuleTypeRepository extends JpaRepository<ModuleType,Long> {
}
