package com.atk.tennisAcademy.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "lockers")
public class Locker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String lockerCode;
    private double duesFee;
    private double allocationFee;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "locker_type_id")
    private LockerType lockerType;

    @Column(name = "created_at")
    @CreationTimestamp
    private Date createdAt;

    @Column(name = "last_modified_at")
    @UpdateTimestamp
    private Date lastModifiedAt;

    private String createdBy;
    private String modifiedBy;
}
