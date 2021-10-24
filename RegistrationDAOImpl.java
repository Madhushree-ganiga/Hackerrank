package com.wolken.hackerrank.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.wolken.hackerrank.entity.UserEntity;
import com.wolken.hackerrank.utils.Hibernateutils;

public class RegistrationDAOImpl implements RegistrationDAO {

	public int save(UserEntity entity) {
		SessionFactory factory=null;
		Session session=null;
		try {
			factory=Hibernateutils.getInstance();
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			session.save(entity);
			transaction.commit();
			
		}finally {
			session.close();
		}
		return 0;
	}

}
	