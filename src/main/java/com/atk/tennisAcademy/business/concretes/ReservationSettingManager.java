package com.atk.tennisAcademy.business.concretes;

import com.atk.tennisAcademy.business.abstracts.ReservationSettingService;
import com.atk.tennisAcademy.dataAccess.ReservationRepository;
import com.atk.tennisAcademy.dataAccess.ReservationSettingRepository;
import com.atk.tennisAcademy.entities.ReservationSetting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationSettingManager implements ReservationSettingService {

    @Autowired
    ReservationSettingRepository reservationSettingRepository;

    @Override
    public ReservationSetting getReservationSettingById(Long id) {
        return reservationSettingRepository.findById(id).orElse(null);
    }

    @Override
    public boolean deleteReservationSetting(Long id) {
        try {
            reservationSettingRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }

    }

    @Override
    public ReservationSetting saveReservationSetting(ReservationSetting reservationSetting) {
        return reservationSettingRepository.save(reservationSetting);
    }

    @Override
    public ReservationSetting updateReservationSetting(Long id, ReservationSetting reservationSetting) {
        ReservationSetting foundReservationSetting = getReservationSettingById(id);
        if(foundReservationSetting !=null){
            foundReservationSetting.setReservationPeriod(reservationSetting.getReservationPeriod());
            foundReservationSetting.setReservationBeginningTime(reservationSetting.getReservationBeginningTime());
            foundReservationSetting.setReservationEndingTime(reservationSetting.getReservationEndingTime());
            foundReservationSetting.setReservationCancellationPeriod(reservationSetting.getReservationCancellationPeriod());
            foundReservationSetting.setReservationForwardDay(reservationSetting.getReservationForwardDay());
            foundReservationSetting.setMaxReservationHourInPrimeTime(reservationSetting.getMaxReservationHourInPrimeTime());
            foundReservationSetting.setMaxReservationHour(reservationSetting.getMaxReservationHour());
            foundReservationSetting.setMinTimePeriod(reservationSetting.getMinTimePeriod());
            foundReservationSetting.setReservationForwardDayForTrainers(reservationSetting.getReservationForwardDayForTrainers());
            foundReservationSetting.setReservationCancellationPeriodTrainers(reservationSetting.getReservationCancellationPeriodTrainers());
            foundReservationSetting.setWebReservationBeginningTime(reservationSetting.getWebReservationBeginningTime());
            foundReservationSetting.setWebReservationEndingTime(reservationSetting.getWebReservationEndingTime());
            foundReservationSetting.setPlayerWaitingMinute(reservationSetting.getPlayerWaitingMinute());
            foundReservationSetting.setMaxNumberOfDaysOwed(reservationSetting.getMaxNumberOfDaysOwed());
            return reservationSettingRepository.save(foundReservationSetting);
        }else{return null;}

    }
}
