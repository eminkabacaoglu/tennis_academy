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
    public Member(String firstName, String lastName, String username, String password, LocalDate dateOfBirth, String placeOfBirth, boolean isActive, String memberNo) {
        super(firstName, lastName, username, password, dateOfBirth, placeOfBirth, isActive);
        this.memberNo = memberNo;
    }
}
