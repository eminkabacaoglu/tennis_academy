package com.atk.tennisAcademy.webApi.controllers;

import com.atk.tennisAcademy.business.abstracts.LevelService;
import com.atk.tennisAcademy.entities.FieldType;
import com.atk.tennisAcademy.entities.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/levels")
@CrossOrigin(origins = "http://localhost:4200")
public class LevelsController {

    @Autowired
    LevelService levelService;

    @GetMapping
    public List<Level> getAllFieldTypes(){
        return levelService.getAllLevels();
    }

    @GetMapping("/{id}")
    public Level getFieldTypeById(@PathVariable Long id){
        return levelService.getLevelById(id);
    }

    @PostMapping
    public Level saveFieldType(@RequestBody  Level level){
        return levelService.saveLevel(level);
    }

    @DeleteMapping("/id")
    public boolean deleteFieldType(@PathVariable Long id){
        return levelService.deleteLevel(id);
    }

    @PutMapping("/{id}")
    public Level updateFieldType(@PathVariable Long id, @RequestBody Level level){
        return levelService.updateLevel(id,level);
    }

}
