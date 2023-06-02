package com.atk.tennisAcademy.webApi.controllers;

import com.atk.tennisAcademy.business.abstracts.ReservationSettingService;
import com.atk.tennisAcademy.entities.ReservationSetting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/reservationsettings")
public class ReservationSettingsController {

    @Autowired
    ReservationSettingService reservationSettingService;

    @GetMapping
    public ReservationSetting getReservationSetting(){
        return reservationSettingService.getReservationSettingFirst();
    }

    @PostMapping
    public ReservationSetting saveReservationSetting(@RequestBody ReservationSetting reservationSetting){
        return reservationSettingService.saveReservationSetting(reservationSetting);
    }

    @DeleteMapping()
    public boolean deleteReservationSetting(){
        Long reservationSettingId=reservationSettingService.getReservationSettingFirst().getId();
        return reservationSettingService.deleteReservationSetting(reservationSettingId);
    }

    @PutMapping()
    public ReservationSetting updateReservationSetting(@RequestBody ReservationSetting reservationSetting){
        Long reservationSettingId=reservationSettingService.getReservationSettingFirst().getId();
        return reservationSettingService.updateReservationSetting(reservationSettingId,reservationSetting);
    }
}
