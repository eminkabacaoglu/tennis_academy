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

    @Override
    public boolean deleteMemberType(Long id) {
       try {
           memberTypeRepository.deleteById(id);
           return true;
       }catch (Exception e){
           return false;
       }

    }

    @Override
    public MemberType getMemberTypeById(Long id) {
        return memberTypeRepository.findById(id).orElse(null);
    }

    @Override
    public MemberType updateMemberType(Long id, MemberType memberType) {
        MemberType foundMemberType = getMemberTypeById(id);
        if (foundMemberType!=null) {
            foundMemberType.setTypeCode(memberType.getTypeCode());
            foundMemberType.setDescription(memberType.getDescription());
            foundMemberType.setModifiedBy(memberType.getModifiedBy());
            memberTypeRepository.save(foundMemberType);
            return foundMemberType;
        } else
            return null;
    }
}
