package com.atk.tennisAcademy.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;

//    @Column(unique = true) //made comment line for testing process
    private String username;
    private String password;

//    @Column(unique = true)//made comment line for testing process
    private String nationalId;
    private LocalDate dateOfBirth;
    private String placeOfBirth;

    private String mobilePhone;
    private String homePhone;
    private String email;

    private boolean isActive = true;
    @Enumerated(EnumType.STRING)
    Gender gender;

    private String photoUrl;
    private boolean isWebReservation = true;

    public Person(String firstName, String lastName, String username, String password, String nationalId, LocalDate dateOfBirth, String placeOfBirth,  Gender gender,String mobilePhone,String homePhone,String email,String photoUrl) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.nationalId = nationalId;
        this.dateOfBirth = dateOfBirth;
        this.placeOfBirth = placeOfBirth;
        this.gender = gender;
        this.mobilePhone = mobilePhone;
        this.homePhone = homePhone;
        this.photoUrl = photoUrl;
        this.email = email;
    }



    public enum Gender{
        Female,
        Male
    }

}
