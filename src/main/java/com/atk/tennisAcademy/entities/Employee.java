package com.atk.tennisAcademy.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "employees")
public class Employee extends Person{

    private boolean isMarried=false;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_type_id")
    private EmployeeType employeeType;

    @Enumerated(EnumType.STRING)
    DriverLicence driverLicense;

    @Builder
    public Employee(String firstName, String lastName, String username, String password, String nationalId, LocalDate dateOfBirth, String placeOfBirth, Gender gender, String mobilePhone, String homePhone, String email, String photoUrl,City city,County county,String createdBy,  EmployeeType employeeType, DriverLicence driverLicense) {
        super(firstName, lastName, username, password, nationalId, dateOfBirth, placeOfBirth, gender,mobilePhone,homePhone,email,photoUrl,city,county,createdBy);
        this.employeeType = employeeType;
        this.driverLicense = driverLicense;
    }

    public enum DriverLicence{
            Yok {
                public String toString() {
                    return "Yok";
                }
            },

            A1 {
                public String toString() {
                    return "A1 (Motosiklet)";
                }
            },
             A2 {
                 public String toString() {
                     return "A2 (Motosiklet)";
                 }
             },
             A {
                 public String toString() {
                     return "A (Motosiklet)";
                 }
             },
             BM {
                 public String toString() {
                     return "B (Otomobil)";
                 }
             },
             BO {
                 public String toString() {
                     return "B (Otomatik)";
                 }
        },
        C {
            public String toString() {
                return "C (Kamyon)";
            }
        },
        D {
            public String toString() {
                return "D (Otobüs)";
            }
        },

        E {
            public String toString() {
                return "E (Tır)";
            }
        },


    }
}
