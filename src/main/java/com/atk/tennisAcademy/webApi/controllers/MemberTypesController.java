package com.atk.tennisAcademy.webApi.controllers;

import com.atk.tennisAcademy.business.abstracts.MemberTypeService;
import com.atk.tennisAcademy.entities.MemberType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
//@CrossOrigin(origins = {"http://localhost:4200", "http://example2.com"})
@RequestMapping("/membertypes")
public class MemberTypesController {

    @Autowired
    MemberTypeService memberTypeService;

    @GetMapping
    public List<MemberType> getAllMemberTypes(){
        return memberTypeService.getAllMemberTypes();
    }

    @GetMapping("/{id}")
    public MemberType getMemberTypeById(@PathVariable Long id){
        return memberTypeService.getMemberTypeById(id);
    }

    @PostMapping
    public MemberType saveMemberType(@RequestBody MemberType memberType){
        return memberTypeService.saveMemberType(memberType);
    }

    @DeleteMapping("/{id}")
    public boolean deleteMemberType(@PathVariable Long id){
        return  memberTypeService.deleteMemberType(id);
    }

    @PutMapping("/{id}")
    public MemberType updateMemberType(@PathVariable Long id,@RequestBody MemberType memberType){
        return memberTypeService.updateMemberType(id,memberType);
    }

}
