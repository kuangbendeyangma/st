package com.hou.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.web.bean.Financial_planner;
import com.web.bean.Member;
import com.web.bean.Member_bankcards;

@Component
public class MemberDao {
	@Autowired
	private SessionFactory sessionFactory;
	//��ȡsession
	public Session getsession(){
		return sessionFactory.getCurrentSession();
	}
	//��ѯ�˺�
	public List<Member> listmember(){
		Session session=getsession();
		String sql="select member_name,name,mobile_Phone,identity,invitationCode,create_date from member";
		List<Member> memberlist=session.createSQLQuery(sql).list();
		return memberlist;
	}
	//���ʦ���
	public List<Financial_planner> listplanner(){
		Session session=getsession();
		String sql="select f.name,f.orgname,f.mycard,f.address,m.mobile_phone,f.create_date from member m,financial_planner f where m.id=f.member_id";
		List<Financial_planner> plannerlist=session.createSQLQuery(sql).list();
		return plannerlist;
	}
	//�󿨲�ѯ
	public List<Member_bankcards> listbankcards(){
		Session session=getsession();
		String sql="select m.mobile_Phone,m.member_name,m.identity,mb.type,mb.card_no,mb.cardaddress,mb.create_date,mb.delflag from member m,member_bankcards mb where mb.member_id=m.id";
		List<Member_bankcards> bankcardslist=session.createSQLQuery(sql).list();
		return bankcardslist;
	}
	
}
