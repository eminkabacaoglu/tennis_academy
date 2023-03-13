package com.atk.tennisAcademy.dataAccess;

import com.atk.tennisAcademy.entities.Level;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LevelRepository extends JpaRepository<Level,Long> {
}
