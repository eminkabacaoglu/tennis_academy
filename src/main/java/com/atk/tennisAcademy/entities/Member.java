package com.atk.tennisAcademy.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Table(name = "members")
public class Member extends Person{
    private String memberNo;
    private String job;
    private String fatherName;
    private String motherName;
    private LocalDate dateOfMembershipBegin;
    private LocalDate dateOfMembershipEnd;
    @ManyToOne
    @JoinColumn(name = "membership_status_id")
    private Status membershipStatus;

    @ManyToOne
    @JoinColumn(name = "member_type_id")
    private MemberType memberType;

    @Builder
    public Member(String firstName, String lastName, String username, String password, String nationalId, LocalDate dateOfBirth, String placeOfBirth, Gender gender, String memberNo, String job, String fatherName, String motherName, LocalDate dateOfMembershipBegin, LocalDate dateOfMembershipEnd, Status membershipStatus, MemberType memberType) {
        super(firstName, lastName, username, password, nationalId, dateOfBirth, placeOfBirth, gender);
        this.memberNo = memberNo;
        this.job = job;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.dateOfMembershipBegin = dateOfMembershipBegin;
        this.dateOfMembershipEnd = dateOfMembershipEnd;
        this.membershipStatus = membershipStatus;
        this.memberType = memberType;
    }
}
