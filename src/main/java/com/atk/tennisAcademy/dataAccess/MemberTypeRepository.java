package com.atk.tennisAcademy.dataAccess;

import com.atk.tennisAcademy.entities.MemberType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberTypeRepository extends JpaRepository<MemberType,Long> {
}
