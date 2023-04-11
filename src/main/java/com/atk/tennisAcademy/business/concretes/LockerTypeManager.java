package com.atk.tennisAcademy.business.concretes;

import com.atk.tennisAcademy.business.abstracts.LockerTypeService;
import com.atk.tennisAcademy.dataAccess.LockerTypeRepository;
import com.atk.tennisAcademy.entities.LockerType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LockerTypeManager implements LockerTypeService {
    @Autowired
    LockerTypeRepository lockerTypeRepository;

    @Override
    public List<LockerType> getAllLockerTypes() {
        return lockerTypeRepository.findAll();
    }

    @Override
    public LockerType getLockerTypeById(Long id) {
        return lockerTypeRepository.findById(id).orElse(null);
    }

    @Override
    public LockerType saveLockerType(LockerType lockerType) {
        return lockerTypeRepository.save(lockerType);
    }

    @Override
    public boolean deleteLockerType(Long id) {
        try {
            lockerTypeRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public LockerType updateLockerType(Long id, LockerType lockerType) {
        LockerType foundLockerType = getLockerTypeById(id);
        if(foundLockerType != null){
            foundLockerType.setDescription(lockerType.getDescription());
            foundLockerType.setModifiedBy(lockerType.getModifiedBy());
            return lockerTypeRepository.save(foundLockerType);
        } else{
            return null;
        }
    }
}
