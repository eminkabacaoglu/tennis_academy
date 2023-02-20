package com.atk.tennisAcademy.webApi.controllers;

import com.atk.tennisAcademy.business.abstracts.MembershipStatusService;
import com.atk.tennisAcademy.entities.MembershipStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/membershipstatuses")
public class MembershipStatusesController {

    @Autowired
    MembershipStatusService membershipStatusService;

    @GetMapping
    public List<MembershipStatus> getAllMembershipStatuses(){
        return membershipStatusService.getAllMembershipStatuses();
    }

    @GetMapping("/{id}")
    public MembershipStatus getMembershipStatusById(@PathVariable Long id){
        return  membershipStatusService.getMembershipStatusById(id);
    }
    @PostMapping
    public MembershipStatus saveMembershipStatus(@RequestBody MembershipStatus membershipStatus){
        return membershipStatusService.saveMembershipStatus(membershipStatus);
    }

    @PutMapping("/{id}")
    public MembershipStatus updateMembershipStatus(@PathVariable Long id,@RequestBody MembershipStatus membershipStatus){
        return membershipStatusService.updateMembershipStatus(id,membershipStatus);
    }

    @DeleteMapping("/{id}")
    public boolean deleteMembershipStatus(@PathVariable Long id){
        return  membershipStatusService.deleteMembershipStatus(id);
    }
}
