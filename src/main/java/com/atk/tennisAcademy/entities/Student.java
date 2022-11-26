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
    @Enumerated(EnumType.STRING)
    private AttendanceType attendanceType;
//    private StudentType studentType;

    @ManyToMany(cascade =CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinTable(
            name = "student_parent",
            joinColumns = @JoinColumn(name = "student_id",
            referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "parent_id",
            referencedColumnName = "id"))
    private List<Member> members;
    @Builder
    public Student(String firstName, String lastName, String username, String password, String nationalId, LocalDate dateOfBirth, String placeOfBirth, Gender gender,String mobilePhone,String homePhone,String email,String photoUrl, String school,AttendanceType attendanceType) {
        super(firstName, lastName, username, password, nationalId, dateOfBirth, placeOfBirth, gender,mobilePhone,homePhone,email,photoUrl);
        this.school = school;
        this.attendanceType = attendanceType;
    }
    public enum AttendanceType{
        General{
            public String toString() {
                return "Genel";
            }
        },
        Full_Time{
            public String toString() {
                return "Tam Gün";
            }
        },
        Half_time{
            public String toString() {
                return "Yarım Gün";
            }
        }
    }

    public void addParent(Member member){
        if(members ==null) members = new ArrayList<>();
        members.add(member);
    }
}
