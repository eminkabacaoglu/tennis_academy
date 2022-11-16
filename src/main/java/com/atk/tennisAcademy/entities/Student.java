package com.atk.tennisAcademy.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "students")
public class Student extends Person{
    private String school;

    @ManyToMany(cascade =CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinTable(
            name = "student_parent",
            joinColumns = @JoinColumn(name = "student_id",
            referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "parent_id",
            referencedColumnName = "id"))
    private List<Parent> parents;
    @Builder
    public Student(String firstName, String lastName, String username, String password, String nationalId, LocalDate dateOfBirth, String placeOfBirth, Gender gender, String school) {
        super(firstName, lastName, username, password, nationalId, dateOfBirth, placeOfBirth, gender);
        this.school = school;
    }


    public void addParent(Parent parent){
        if(parents ==null) parents = new ArrayList<>();
        parents.add(parent);
    }
}
