package com.atk.tennisAcademy.business.abstracts;

import com.atk.tennisAcademy.entities.MemberType;
import com.atk.tennisAcademy.entities.MembershipStatus;

import java.util.List;

public interface MembershipStatusService {
    List<MembershipStatus> getAllMembershipStatuses();

    MembershipStatus saveMembershipStatus(MembershipStatus membershipStatus);

    MembershipStatus getMembershipStatusById(Long id);
    MembershipStatus updateMembershipStatus(Long id ,MembershipStatus membershipStatus);


    boolean deleteMembershipStatus(Long id);
}
