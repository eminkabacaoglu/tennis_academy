package com.atk.tennisAcademy.business.concretes;

import com.atk.tennisAcademy.business.abstracts.LoginService;
import com.atk.tennisAcademy.dataAccess.LoginRepository;
import com.atk.tennisAcademy.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginManager implements LoginService {

    @Autowired
    LoginRepository loginRepository;

    @Override
    public Person login(String username, String password) {
        Person loginPerson = loginRepository.findByUsernameAndPassword(username,password);
        if(loginPerson != null){
            return loginPerson;
        }
        return null;
    }
}
