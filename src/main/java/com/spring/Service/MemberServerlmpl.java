package com.spring.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.DAO.MemberDAO;
import com.spring.Models.Member;


@Service
public class MemberServerlmpl  implements MemberService{

	@Autowired
	private MemberDAO memberDAO;
	
	@Override
	public List<Member> findAll() {
	
		return memberDAO.findAll();
	}

	@Override
	public Member findOne(int id) {
		Member member = memberDAO.findOne(id);
		return member;
	}

	@Override
	public void delete(int id) {
		memberDAO.delete(id);
		
	}

	@Override
	public void updateMember(Member m) {
		memberDAO.updateMember(m);		
	}

	@Override
	public synchronized boolean  addMember(Member m) {
		if(memberDAO.existsMember(m)){
			return false;
		}else{
			memberDAO.addMember(m);
			return false;

		}
		
	}

}
