package com.atk.tennisAcademy.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.Period;
import java.util.Date;

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

    @Column(name = "created_at")
    @CreationTimestamp
    private Date createdAt;

    @Column(name = "last_modified_at")
    @UpdateTimestamp
    private Date lastModifiedAt;

    private String createdBy;
    private String modifiedBy;


}
