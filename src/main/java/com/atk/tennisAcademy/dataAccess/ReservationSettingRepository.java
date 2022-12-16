package com.atk.tennisAcademy.dataAccess;

import com.atk.tennisAcademy.entities.ReservationSetting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationSettingRepository extends JpaRepository<ReservationSetting,Long> {
}
