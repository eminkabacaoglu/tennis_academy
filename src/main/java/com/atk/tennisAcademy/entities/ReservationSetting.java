package com.atk.tennisAcademy.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Period;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationSetting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int maxNumberOfDaysOwed;
    private int playerWaitingMinute;
    private String reservationBeginningTime;
    private String reservationEndingTime;
    private int reservationForwardDay;
    private int reservationForwardDayForTrainers;
    private int reservationCancellationPeriod;
    private int reservationCancellationPeriodTrainers;
    private int reservationPeriod;
    private String webReservationBeginningTime;
    private String webReservationEndingTime;
    private int minTimePeriod;
    private int maxReservationHour;
    private int maxReservationHourInPrimeTime;


}
