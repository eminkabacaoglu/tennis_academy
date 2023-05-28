package com.atk.tennisAcademy.dataAccess;

import com.atk.tennisAcademy.entities.Locker;
import com.atk.tennisAcademy.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LockerRepository extends JpaRepository<Locker,Long> {

    Locker findByMemberId(Long id);
    List<Locker> findByMemberIsNull();
}
