package com.atk.tennisAcademy.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "persons")
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id")
    private City city;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "county_id")
    private County county;

    private String address;

    @Column(name = "created_at")
    @CreationTimestamp
    private Date createdAt;


    @Column(name = "last_modified_at")
    @UpdateTimestamp
    private Date lastModifiedAt;

    private String createdBy;
    private String modifiedBy;

    public Person(String firstName, String lastName, String username, String password, String nationalId, LocalDate dateOfBirth, String placeOfBirth,  Gender gender,String mobilePhone,String homePhone,String email,String photoUrl,City city,County county, Date createdAt,String createdBy) {
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
        this.city = city;
        this.county = county;
        this.email = email;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
    }



    public enum Gender{
        Female,
        Male
    }

}
