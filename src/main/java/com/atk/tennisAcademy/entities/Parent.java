package com.atk.tennisAcademy.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "parents")
public class Parent extends Person{
    private String job;

    @Builder
    public Parent(String firstName, String lastName, String username, String password, String nationalId, LocalDate dateOfBirth, String placeOfBirth, Gender gender, String mobilePhone, String homePhone, String email, String photoUrl, String job, Date createdAt) {
        super(firstName, lastName, username, password, nationalId, dateOfBirth, placeOfBirth, gender,mobilePhone,homePhone,email,photoUrl,createdAt);
        this.job = job;
    }
}
