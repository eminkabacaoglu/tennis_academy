package com.atk.tennisAcademy.business.concretes;

import com.atk.tennisAcademy.business.abstracts.MemberService;
import com.atk.tennisAcademy.dataAccess.MemberRepository;
import com.atk.tennisAcademy.entities.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberManager implements MemberService {
    @Autowired
    MemberRepository memberRepository;

    public List<Member> getAllMembers(){
        return memberRepository.findAll();
    }

    @Override
    public Member getMemberById(Long id) {
        return memberRepository.findById(id).orElse(null);
    }

    @Override
    public boolean deleteMember(Long id) {
        try {
            memberRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public Member saveMember(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public Member updateMember(Long id, Member member) {
        Member foundMember = getMemberById(id);

        foundMember.setFirstName(member.getFirstName());
        foundMember.setLastName(member.getLastName());
        foundMember.setUsername(member.getUsername());
        foundMember.setPassword(member.getPassword());
        foundMember.setNationalId(member.getNationalId());
        foundMember.setDateOfBirth(member.getDateOfBirth());
        foundMember.setPlaceOfBirth(member.getPlaceOfBirth());
        foundMember.setMobilePhone(member.getMobilePhone());
        foundMember.setHomePhone(member.getHomePhone());
        foundMember.setEmail(member.getEmail());
        foundMember.setGender(member.getGender());
        foundMember.setPhotoUrl(member.getPhotoUrl());
        foundMember.setJob(member.getJob());
        foundMember.setFatherName(member.getFatherName());
        foundMember.setMotherName(member.getMotherName());
        foundMember.setDateOfMembershipBegin(member.getDateOfMembershipBegin());
        foundMember.setDateOfMembershipEnd(member.getDateOfMembershipEnd());
        foundMember.setMembershipStatus(member.getMembershipStatus());
        foundMember.setMemberType(member.getMemberType());
        foundMember.setNote(member.getNote());
        foundMember.setActive(member.isActive());
        foundMember.setWebReservation(member.isWebReservation());

        return memberRepository.save(foundMember);

    }

    @Override
    public List<String> nameMember() {
        return memberRepository.getMembersNames();
    }


}
