package com.atk.tennisAcademy.business.abstracts;

import com.atk.tennisAcademy.entities.LockerType;

import java.util.List;

public interface LockerTypeService {

    List<LockerType> getAllLockerTypes();
    LockerType getLockerTypeById(Long id);
    LockerType saveLockerType(LockerType lockerType);
    boolean deleteLockerType(Long id);
    LockerType updateLockerType(Long id , LockerType lockerType);
}
