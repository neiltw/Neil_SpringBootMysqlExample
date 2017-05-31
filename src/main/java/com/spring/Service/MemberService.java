package com.spring.Service;

import java.util.List;

import com.spring.Models.Member;

public interface MemberService {
	List<Member> findAll();
	Member findOne(int id);
	void delete(int id);
	void updateMember(Member m);
	boolean addMember(Member m);
}
