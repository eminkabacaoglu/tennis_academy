package com.atk.tennisAcademy.business.concretes;

import com.atk.tennisAcademy.business.abstracts.MembershipStatusService;
import com.atk.tennisAcademy.dataAccess.MembershipStatusRepository;
import com.atk.tennisAcademy.entities.MembershipStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembershipStatusManager implements MembershipStatusService {

    @Autowired
    MembershipStatusRepository membershipStatusRepository;

    @Override
    public List<MembershipStatus> getAllMembershipStatuses() {
        return membershipStatusRepository.findAll();
    }

    @Override
    public MembershipStatus saveMembershipStatus(MembershipStatus membershipStatus) {
        return membershipStatusRepository.save(membershipStatus);
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
