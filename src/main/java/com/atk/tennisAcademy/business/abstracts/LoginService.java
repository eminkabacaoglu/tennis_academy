package com.atk.tennisAcademy.business.abstracts;

import com.atk.tennisAcademy.entities.Person;

public interface LoginService {

    Person login(String username, String password);
}
