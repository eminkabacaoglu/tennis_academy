package com.atk.tennisAcademy.webApi.controllers;

import com.atk.tennisAcademy.business.abstracts.MembershipStatusService;
import com.atk.tennisAcademy.entities.MembershipStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/membershipstatuses")
public class MembershipStatusesController {

    @Autowired
    MembershipStatusService membershipStatusService;

    @GetMapping
    public List<MembershipStatus> getAllMembershipStatuses(){
        return membershipStatusService.getAllMembershipStatuses();
    }

    @PostMapping
    public MembershipStatus saveMembershipStatus(@RequestBody MembershipStatus membershipStatus){
        return membershipStatusService.saveMembershipStatus(membershipStatus);
    }

    @DeleteMapping("/{id}")
    public boolean deleteMembershipStatus(@PathVariable Long id){
        return  membershipStatusService.deleteMembershipStatus(id);
    }
}
