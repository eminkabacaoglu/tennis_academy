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

    @ManyToMany(mappedBy = "parents",fetch=FetchType.LAZY)
    private List<Student> students;
    @Builder
    public Parent(String firstName, String lastName, String username, String password, LocalDate dateOfBirth, String placeOfBirth, boolean isActive, String job) {
        super(firstName, lastName, username, password, dateOfBirth, placeOfBirth, isActive);
        this.job = job;
    }
}
