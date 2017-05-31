package com.spring.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.Models.Member;

@Transactional
@Repository
public class MemberDAO  implements MemberRepoDAO{

	
	@PersistenceContext	
	private EntityManager entityManager;	
	
	
	@Override
	public List<Member> findAll() {
		String hql = "FROM Member";
		List<Member> resultList = entityManager.createQuery(hql).getResultList();
		return resultList;
	}

	@Override
	public Member findOne(int id) {
		// TODO Auto-generated method stub
		return entityManager.find(Member.class,id);
	}

	
	@Override
	public void addMember(Member m){
		entityManager.persist(m);
	}
	
	@Override
	public boolean existsMember(Member m) {
		String hql = "FROM Member as atcl WHERE atcl.id = ? ";
		int count = entityManager.createQuery(hql).setParameter(1, m.getId())
		              .getResultList().size();
		return count > 0 ? true : false;
	}

	public void delete(int id) {
		entityManager.remove(findOne(id));
		
	}

	@Override
	public void updateMember(Member m) {
		Member member = findOne(m.getId());
		member.setDescription(m.getDescription());
		member.setName(m.getName());
		entityManager.flush();	
	}

}
