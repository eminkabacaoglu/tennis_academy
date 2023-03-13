package com.atk.tennisAcademy.business.concretes;

import com.atk.tennisAcademy.business.abstracts.LevelService;
import com.atk.tennisAcademy.dataAccess.LevelRepository;
import com.atk.tennisAcademy.entities.FieldType;
import com.atk.tennisAcademy.entities.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LevelManager implements LevelService {

    @Autowired
    LevelRepository levelRepository;

    @Override
    public List<Level> getAllLevels() {
        return levelRepository.findAll();
    }

    @Override
    public Level getLevelById(Long id) {
        return levelRepository.findById(id).orElse(null);
    }

    @Override
    public Level saveLevel(Level level) {
        return levelRepository.save(level);
    }

    @Override
    public boolean deleteLevel(Long id) {
        try {
            levelRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public Level updateLevel(Long id, Level level) {
        Level foundLevel = getLevelById(id);
        if(foundLevel!=null){
            foundLevel.setLevelCode(level.getLevelCode());
            foundLevel.setLevelDescription(level.getLevelDescription());
            foundLevel.setModifiedBy(level.getModifiedBy());
            foundLevel.setQuota(level.getQuota());
            foundLevel.setModuleType(level.getModuleType());
            levelRepository.save(foundLevel);
            return foundLevel;
        }
        else{
            return null;
        }
    }
}
