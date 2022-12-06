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
    public Member getMemberById(Long id) {
        return memberRepository.findById(id).orElse(null);
    }

    @Override
    public boolean deleteMember(Long id) {
        try {
            memberRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public Member saveMember(Member member) {
        memberRepository.save(member);
        return member;
    }

    @Override
    public Member updateMember(Long id, Member member) {
        Member foundMember = getMemberById(id);

        return foundMember;
    }
}
