package com.atk.tennisAcademy.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "parents")
public class Parent extends Person{
    private String job;

    @Builder

    public Parent(String firstName, String lastName, String username, String password, LocalDate dateOfBirth, String placeOfBirth, boolean isActive, Gender gender, String job) {
        super(firstName, lastName, username, password, dateOfBirth, placeOfBirth, isActive, gender);
        this.job = job;
    }
}
