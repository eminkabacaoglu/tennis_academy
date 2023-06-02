package com.atk.tennisAcademy.webApi.controllers;

import com.atk.tennisAcademy.business.abstracts.LockerService;
import com.atk.tennisAcademy.business.abstracts.MemberService;
import com.atk.tennisAcademy.entities.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/members")
public class MembersController {

    @Autowired
    private MemberService memberService;

    @GetMapping
    public List<Member> getAllMembers(){
        return memberService.getAllMembers();
    }

    @GetMapping("/active")
    public List<Member> getAllActiveMembers(){
        return memberService.getAllActiveMembers();
    }

    @GetMapping("/passive")
    public List<Member> getAllPassiveMembers(){
        return memberService.getAllPassiveMembers();
    }

    @GetMapping("/names")// test amaçlı yazıldı silinecek.
    public List<String> getNames(){
        return memberService.nameMember();
    }

    @GetMapping("/{id}")
    public Member getMember(@PathVariable Long id){
        return memberService.getMemberById(id);
    }


    @PostMapping
    public Member saveMember(@RequestBody Member member){
        return memberService.saveMember(member);
    }

    @DeleteMapping("/{id}")
    public boolean deleteMember(@PathVariable Long id){
           return memberService.deleteMember(id);
    }

    @PutMapping("/{id}")
    public Member updateMember(@PathVariable Long id,@RequestBody Member member){

        return memberService.updateMember(id,member);

    }


}
