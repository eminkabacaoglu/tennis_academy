package com.atk.tennisAcademy.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "trainers")
public class Trainer extends Person{
    private String branch; //temporary field for an example

    @Builder
    public Trainer(String firstName, String lastName, String username, String password, String nationalId, LocalDate dateOfBirth, String placeOfBirth, boolean isActive, Gender gender, String branch) {
        super(firstName, lastName, username, password, nationalId, dateOfBirth, placeOfBirth, isActive, gender);
        this.branch = branch;
    }
}
