package com.atk.tennisAcademy.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "module_type")
public class ModuleType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String moduleDescription;
    @Column(name = "created_at")
    @CreationTimestamp
    private Date createdAt;

    @Column(name = "last_modified_at")
    @UpdateTimestamp
    private Date lastModifiedAt;

    private String createdBy;
    private String modifiedBy;
}
