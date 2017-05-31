package com.spring.DAO;

import java.util.List;


import com.spring.Models.Member;

public interface MemberRepoDAO {
	List<Member> findAll();
	Member findOne(int id);
	boolean existsMember(Member id);
	void delete(int id);
	void updateMember(Member id);
	void addMember(Member m);
}


