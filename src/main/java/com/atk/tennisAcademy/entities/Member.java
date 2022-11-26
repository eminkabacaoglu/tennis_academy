package com.atk.tennisAcademy.entities;

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
    private String job;
    private String fatherName;
    private String motherName;
    private LocalDate dateOfMembershipBegin;
    private LocalDate dateOfMembershipEnd;
    @ManyToOne
    @JoinColumn(name = "membership_status_id")
    private MembershipStatus membershipStatus;

    @ManyToOne
    @JoinColumn(name = "member_type_id")
    private MemberType memberType;

    private String note;

    @Builder
    public Member(String firstName, String lastName, String username, String password, String nationalId, LocalDate dateOfBirth, String placeOfBirth, Gender gender,String mobilePhone,String homePhone,String email, String photoUrl, String job, String fatherName, String motherName, LocalDate dateOfMembershipBegin, LocalDate dateOfMembershipEnd, MembershipStatus membershipStatus, MemberType memberType,String note) {
        super(firstName, lastName, username, password, nationalId, dateOfBirth, placeOfBirth, gender,mobilePhone,homePhone,email,photoUrl);
        this.job = job;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.dateOfMembershipBegin = dateOfMembershipBegin;
        this.dateOfMembershipEnd = dateOfMembershipEnd;
        this.membershipStatus = membershipStatus;
        this.memberType = memberType;
        this.note = note;
    }
}
