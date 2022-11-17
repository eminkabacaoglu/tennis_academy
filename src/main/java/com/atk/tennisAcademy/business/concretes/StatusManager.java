package com.atk.tennisAcademy.business.concretes;

import com.atk.tennisAcademy.business.abstracts.StatusService;
import com.atk.tennisAcademy.dataAccess.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatusManager implements StatusService {
    @Autowired
    StatusRepository statusRepository;
}
