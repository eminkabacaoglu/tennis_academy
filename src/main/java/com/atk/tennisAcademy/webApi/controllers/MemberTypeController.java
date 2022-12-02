package com.atk.tennisAcademy.webApi.controllers;

import com.atk.tennisAcademy.business.abstracts.MemberTypeService;
import com.atk.tennisAcademy.entities.MemberType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/membertypes")
public class MemberTypeController {

    @Autowired
    MemberTypeService memberTypeService;

    @GetMapping
    public List<MemberType> getAllMemberTypes(){
        return memberTypeService.getAllMemberTypes();
    }

    @PostMapping
    public MemberType saveMemberType(@RequestBody MemberType memberType){
        return memberTypeService.saveMemberType(memberType);
    }

}
