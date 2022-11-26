package com.atk.tennisAcademy.business.concretes;

import com.atk.tennisAcademy.business.abstracts.MemberService;
import com.atk.tennisAcademy.dataAccess.MemberRepository;
import com.atk.tennisAcademy.entities.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberManager implements MemberService {
    @Autowired
    MemberRepository memberRepository;

    public List<Member> getAllMembers(){
        return memberRepository.findAll();
    }

    @Override
    public Member getMember(Long id) {
        return memberRepository.findById(id).orElse(null);
    }

    @Override
    public void deteleMember(Long id) {
        memberRepository.deleteById(id);
    }
}
