package com.atk.tennisAcademy.business.concretes;

import com.atk.tennisAcademy.business.abstracts.MembershipStatusService;
import com.atk.tennisAcademy.dataAccess.MemberRepository;
import com.atk.tennisAcademy.dataAccess.MembershipStatusRepository;
import com.atk.tennisAcademy.entities.MembershipStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembershipStatusManager implements MembershipStatusService {

    @Autowired
    MembershipStatusRepository membershipStatusRepository;
    @Autowired
    private MemberRepository memberRepository;

    @Override
    public List<MembershipStatus> getAllMembershipStatuses() {
        return membershipStatusRepository.findAll();
    }

    @Override
    public MembershipStatus saveMembershipStatus(MembershipStatus membershipStatus) {
        return membershipStatusRepository.save(membershipStatus);
    }

    @Override
    public MembershipStatus getMembershipStatusById(Long id) {
        return membershipStatusRepository.findById(id).orElse(null);
    }

    @Override
    public MembershipStatus updateMembershipStatus(Long id, MembershipStatus membershipStatus) {
        MembershipStatus foundMemberShipStatus = getMembershipStatusById(id);
        if(foundMemberShipStatus !=null){
            foundMemberShipStatus.setStatusName(membershipStatus.getStatusName());
            foundMemberShipStatus.setModifiedBy(membershipStatus.getModifiedBy());
            return membershipStatusRepository.save(foundMemberShipStatus);
        }else {
            return null;
        }

    }

    @Override
    public boolean deleteMembershipStatus(Long id) {
        try {
            membershipStatusRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
