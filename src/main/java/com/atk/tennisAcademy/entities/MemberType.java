package com.atk.tennisAcademy.entities;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "member_types")
@NoArgsConstructor
@Data
public class MemberType extends PersonType{

    @Builder
    public MemberType(Long id, String typeCode, String description) {
        super(id, typeCode, description);
    }
}
