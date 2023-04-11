package com.atk.tennisAcademy.dataAccess;

import com.atk.tennisAcademy.entities.Locker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LockerRepository extends JpaRepository<Locker,Long> {
}
