package com.atk.tennisAcademy.entities;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "students")
public class Student extends Person{
    private String school;
    private String parentNameSurname;
    private String parentJob;
    private String parentWorkPlace;
    private String alternativeParent;
    private boolean isInBlacklist=false;

    private LocalDate dateOfRegisteration;

    public String blackListDescription="";
    @Enumerated(EnumType.STRING)
    private AttendanceType attendanceType;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "student_type_id")
    private StudentType studentType;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "level_id")
    private Level level;

    @ManyToMany(cascade =CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinTable(
            name = "student_member",
            joinColumns = @JoinColumn(name = "student_id",
            referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "member_id",
            referencedColumnName = "id"))
    private List<Member> members;
    @Builder
    public Student(String firstName, String lastName, String username, String password, String nationalId, LocalDate dateOfBirth, String placeOfBirth, Gender gender, String mobilePhone, String homePhone, String email, String photoUrl,City city,County county, String createdBy, String school, AttendanceType attendanceType, StudentType studentType,Level level,LocalDate dateOfRegisteration,String parentNameSurname,String parentJob,String parentWorkPlace,String alternativeParent) {
        super(firstName, lastName, username, password, nationalId, dateOfBirth, placeOfBirth, gender,mobilePhone,homePhone,email,photoUrl,city,county,createdBy);
        this.school = school;
        this.attendanceType = attendanceType;
        this.studentType=studentType;
        this.level = level;
        this.dateOfRegisteration=dateOfRegisteration;
        this.parentNameSurname=parentNameSurname;
        this.parentJob = parentJob;
        this.parentWorkPlace = parentWorkPlace;
        this.alternativeParent = alternativeParent;
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
        Half_Time {
            public String toString() {
                return "Yarım Gün";
            }
        }
    }

    public void addMember(Member member){
        if(members ==null) {
            members = new ArrayList<>();
        }
        members.add(member);
    }
}
