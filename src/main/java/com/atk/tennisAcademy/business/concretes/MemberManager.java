package com.atk.tennisAcademy.business.concretes;

import com.atk.tennisAcademy.business.abstracts.MemberService;
import com.atk.tennisAcademy.dataAccess.MemberRepository;
import com.atk.tennisAcademy.entities.Member;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


//@Log4j2
@Service
public class MemberManager implements MemberService {

    private static final Logger log = LogManager.getLogger(MemberManager.class);

    @Autowired
    MemberRepository memberRepository;

    public List<Member> getAllMembers(){

        log.info("i Members listed");
        log.warn("w Members listed");
        log.error("And here comes the Error Message!");
        log.debug("d Members listed");
        log.trace("t Members listed");
        return memberRepository.findAll();
    }

    @Override
    public List<Member> getAllActiveMembers() {
        return memberRepository.findByIsActiveTrue();
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
        log.info("Member is saved. Id: "+member.getId());
        return memberRepository.save(member);
    }

    @Override
    public Member updateMember(Long id, Member member) {
        Member foundMember = getMemberById(id);
        if(foundMember != null){
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
            foundMember.setModifiedBy(member.getModifiedBy());

            return memberRepository.save(foundMember);
        }else {
            return null;
        }


    }

    @Override
    public List<String> nameMember() {
        return memberRepository.getMembersNames();
    }


}
