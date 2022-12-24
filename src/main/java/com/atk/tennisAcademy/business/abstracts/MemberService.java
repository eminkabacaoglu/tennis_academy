package com.atk.tennisAcademy.business.abstracts;

import com.atk.tennisAcademy.entities.Member;

import java.util.List;

public interface MemberService {
    List<Member> getAllMembers();

    List<Member> getAllActiveMembers();
    Member getMemberById(Long id);
    boolean deleteMember(Long id);
    Member saveMember(Member member);

    Member updateMember(Long id,Member member);

    List<String> nameMember();

}
