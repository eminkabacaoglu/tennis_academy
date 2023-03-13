package com.atk.tennisAcademy.business.abstracts;

import com.atk.tennisAcademy.entities.FieldType;
import com.atk.tennisAcademy.entities.Level;

import java.util.List;

public interface LevelService {
    List<Level> getAllLevels();
    Level getLevelById(Long id);
    Level saveLevel(Level level);
    boolean deleteLevel(Long id);
    Level updateLevel(Long id , Level level);
}
