package com.atk.tennisAcademy.business.abstracts;

import com.atk.tennisAcademy.entities.ReservationSetting;

import java.util.List;

public interface ReservationSettingService {
    ReservationSetting getReservationSettingFirst();
    ReservationSetting getReservationSettingById(Long id);
    boolean deleteReservationSetting(Long id);
    ReservationSetting saveReservationSetting(ReservationSetting reservationSetting);
    ReservationSetting updateReservationSetting(Long id,ReservationSetting reservationSetting);
}
