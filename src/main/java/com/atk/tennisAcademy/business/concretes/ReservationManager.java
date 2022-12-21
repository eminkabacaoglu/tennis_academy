package com.atk.tennisAcademy.business.concretes;

import com.atk.tennisAcademy.business.abstracts.ReservationService;
import com.atk.tennisAcademy.dataAccess.ReservationRepository;
import com.atk.tennisAcademy.entities.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationManager implements ReservationService {

    @Autowired
    ReservationRepository reservationRepository;


    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation getReservationById(Long id) {
        return reservationRepository.findById(id).orElse(null);
    }

    @Override
    public boolean deleteReservation(Long id) {
        try {
            reservationRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }

    }

    @Override
    public Reservation saveReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation updateReservation(Long id, Reservation reservation) {
        Reservation foundReservation = getReservationById(id);
        if(foundReservation != null){
            foundReservation.setField(reservation.getField());
            foundReservation.setMember(reservation.getMember());
            foundReservation.setActive(reservation.isActive());
            foundReservation.setReservationDateTime(reservation.getReservationDateTime());
            foundReservation.setModifiedBy(reservation.getModifiedBy());
            return reservationRepository.save(foundReservation);
        }else{
            return null;
        }

    }
}
