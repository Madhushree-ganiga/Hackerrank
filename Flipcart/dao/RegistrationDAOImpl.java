package com.wolken.Flipcart.dao;

import com.wolken.Flipcart.entity.UserEntity;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.wolken.Flipcart.entity.UserEntity;
import com.wolken.Flipcart.utils.HibernateUtils;



public class RegistrationDAOImpl implements RegistrationDAO {

	public int save(UserEntity entity) {
		SessionFactory factory=null;
		Session session=null;
		try {
			factory=HibernateUtils.getInstance();
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