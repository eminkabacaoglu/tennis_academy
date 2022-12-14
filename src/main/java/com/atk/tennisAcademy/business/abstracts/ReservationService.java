package com.atk.tennisAcademy.business.abstracts;


import com.atk.tennisAcademy.entities.Reservation;

import java.util.List;

public interface ReservationService {
    List<Reservation> getAllReservations();

    Reservation getReservationById(Long id);
    boolean deleteReservation(Long id);
    Reservation saveReservation(Reservation reservation);
    Reservation updateReservation(Long id,Reservation reservation);

    /*
    * get reservation by user
    * get reservation by date
    * */

}
