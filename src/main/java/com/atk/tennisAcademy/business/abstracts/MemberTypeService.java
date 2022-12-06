package com.atk.tennisAcademy.business.abstracts;

import com.atk.tennisAcademy.entities.MemberType;

import java.util.List;

public interface MemberTypeService {
    List<MemberType> getAllMemberTypes();

    MemberType saveMemberType(MemberType memberType);

    boolean deleteMemberType(Long id);

    MemberType getMemberTypeById(Long id);

    MemberType updateMemberType(Long id,MemberType memberType);
}
