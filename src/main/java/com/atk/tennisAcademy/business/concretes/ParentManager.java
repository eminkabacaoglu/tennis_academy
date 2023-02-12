package com.atk.tennisAcademy.business.concretes;

import com.atk.tennisAcademy.business.abstracts.ParentService;
import com.atk.tennisAcademy.dataAccess.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public class ParentManager implements ParentService {
    @Autowired
    ParentRepository parentRepository;
}
