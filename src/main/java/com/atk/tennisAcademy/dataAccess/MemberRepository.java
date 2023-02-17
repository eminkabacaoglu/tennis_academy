package com.atk.tennisAcademy.dataAccess;

import com.atk.tennisAcademy.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<Member,Long> {

    @Query(value = "Select first_name from persons",nativeQuery = true)
    List<String> getMembersNames();
    List<Member> findByIsActiveTrue();

    List<Member> findByIsActiveFalse();

    List<Member> findByIsActiveTrueOrderById();

    List<Member> findByIsActiveFalseOrderById();
}

