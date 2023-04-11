package com.atk.tennisAcademy.dataAccess;

import com.atk.tennisAcademy.entities.LockerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LockerTypeRepository extends JpaRepository<LockerType,Long> {
}
