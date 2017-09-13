package com.qian.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.web.bean.Users;

@Component
public class LoginDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession(){
		return this.sessionFactory.getCurrentSession();
	}
	
	public List<Users> Login(){
		String sql="select user_name,password,mobile_Phone from users";
		Session session=getSession();
		List<Users> list=session.createSQLQuery(sql).list();
		return list;
	}
}
