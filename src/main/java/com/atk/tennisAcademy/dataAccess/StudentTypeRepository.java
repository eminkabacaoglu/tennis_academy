package com.atk.tennisAcademy.dataAccess;

import com.atk.tennisAcademy.entities.StudentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentTypeRepository extends JpaRepository<StudentType,Long> {
}
