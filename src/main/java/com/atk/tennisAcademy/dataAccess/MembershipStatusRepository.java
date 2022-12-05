package com.atk.tennisAcademy.dataAccess;

import com.atk.tennisAcademy.entities.MembershipStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembershipStatusRepository extends JpaRepository<MembershipStatus,Long> {
}
