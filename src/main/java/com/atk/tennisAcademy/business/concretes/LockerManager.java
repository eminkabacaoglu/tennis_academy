package com.atk.tennisAcademy.business.concretes;

import com.atk.tennisAcademy.business.abstracts.LockerService;
import com.atk.tennisAcademy.dataAccess.LockerRepository;
import com.atk.tennisAcademy.entities.Field;
import com.atk.tennisAcademy.entities.Locker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LockerManager implements LockerService {
    @Autowired
    LockerRepository lockerRepository;

    @Override
    public List<Locker> getAllLockers() {
        return lockerRepository.findAll();
    }

    @Override
    public Locker getLockerById(Long id) {
        return lockerRepository.findById(id).orElse(null);
    }

    @Override
    public Locker saveLocker(Locker locker) {
        return lockerRepository.save(locker);
    }

    @Override
    public boolean deleteLocker(Long id) {
        try {
            lockerRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public Locker updateLocker(Long id, Locker locker) {
        Locker foundLocker = getLockerById(id);
        if(foundLocker != null){
            foundLocker.setLockerCode(locker.getLockerCode());
            foundLocker.setLockerType(locker.getLockerType());
            foundLocker.setModifiedBy(locker.getModifiedBy());
            return lockerRepository.save(foundLocker);
        } else{
            return null;
        }
    }
}
