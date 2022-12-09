package com.atk.tennisAcademy.dataAccess;

import com.atk.tennisAcademy.entities.FieldType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FieldTypeRepository extends JpaRepository<FieldType,Long> {
}
