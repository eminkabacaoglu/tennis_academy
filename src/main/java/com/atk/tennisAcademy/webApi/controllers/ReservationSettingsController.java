package com.atk.tennisAcademy.webApi.controllers;

import com.atk.tennisAcademy.business.abstracts.ReservationSettingService;
import com.atk.tennisAcademy.entities.ReservationSetting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/reservationsettings")
public class ReservationSettingsController {

    @Autowired
    ReservationSettingService reservationSettingService;

    @GetMapping
    public ReservationSetting getReservationSetting(@PathVariable Long id){
        return reservationSettingService.getReservationSettingById(id);
    }

    @PostMapping
    public ReservationSetting saveReservationSetting(@RequestBody ReservationSetting reservationSetting){
        return reservationSettingService.saveReservationSetting(reservationSetting);
    }

    @DeleteMapping("/{id}")
    public boolean deleteReservationSetting(@PathVariable Long id){
        return reservationSettingService.deleteReservationSetting(id);
    }

    @PutMapping("/{id}")
    public ReservationSetting updateReservationSetting(@PathVariable Long id, @RequestBody ReservationSetting reservationSetting){
        return reservationSettingService.updateReservationSetting(id,reservationSetting);
    }
}
