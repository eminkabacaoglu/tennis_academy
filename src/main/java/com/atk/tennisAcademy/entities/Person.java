package com.atk.tennisAcademy.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String username;
    private String password;

    @Column(unique = true)
    private String nationalId;
    private LocalDate dateOfBirth;
    private String placeOfBirth;
    @Column(columnDefinition = "boolean default true")
    private boolean isActive;
    @Enumerated(EnumType.STRING)
    Gender gender;

    public Person(String firstName, String lastName, String username, String password, LocalDate dateOfBirth, String placeOfBirth, boolean isActive,Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.placeOfBirth = placeOfBirth;
        this.isActive = isActive;
        this.gender=gender;
    }

    public enum Gender{
        Female,
        Male
    }

}
