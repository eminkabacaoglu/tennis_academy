package com.atk.tennisAcademy.business.concretes;

import com.atk.tennisAcademy.business.abstracts.MemberTypeService;
import com.atk.tennisAcademy.dataAccess.MemberTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberTypeManager implements MemberTypeService {
    @Autowired
    MemberTypeRepository memberTypeRepository;
}
