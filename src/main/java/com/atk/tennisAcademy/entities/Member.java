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
@NoArgsConstructor
@Entity
@Table(name = "members")
public class Member extends Person{
    private String memberNo;

    @Builder
    public Member(String firstName, String lastName, String username, String password, String nationalId, LocalDate dateOfBirth, String placeOfBirth, boolean isActive, Gender gender, String memberNo) {
        super(firstName, lastName, username, password, nationalId, dateOfBirth, placeOfBirth, isActive, gender);
        this.memberNo = memberNo;
    }
}
