package com.atk.tennisAcademy.business.abstracts;

import com.atk.tennisAcademy.entities.Locker;

import java.util.List;

public interface LockerService {
    List<Locker> getAllLockers();
    Locker getLockerById(Long id);
    Locker saveLocker(Locker locker);
    boolean deleteLocker(Long id);
    Locker updateLocker(Long id , Locker locker);
}
