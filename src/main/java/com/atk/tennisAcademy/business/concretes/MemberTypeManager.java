package com.atk.tennisAcademy.business.concretes;

import com.atk.tennisAcademy.business.abstracts.MemberTypeService;
import com.atk.tennisAcademy.dataAccess.MemberTypeRepository;
import com.atk.tennisAcademy.entities.MemberType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberTypeManager implements MemberTypeService {
    @Autowired
    MemberTypeRepository memberTypeRepository;

    @Override
    public List<MemberType> getAllMemberTypes() {
        return memberTypeRepository.findAll();
    }

    @Override
    public MemberType saveMemberType(MemberType memberType) {
        return memberTypeRepository.save(memberType);
    }
}
