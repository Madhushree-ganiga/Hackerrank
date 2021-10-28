package com.wolken.Facebook.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.wolken.Facebook.entity.UserEntity;
import com.wolken.Facebook.utils.HibernateUtils;

public class DaoImpl implements Dao {
	public String save(UserEntity entity) {
        Session session = null;
        SessionFactory factory;
        try {
            factory = HibernateUtils.getFactory();
            session = factory.openSession();
            Transaction transaction = session.beginTransaction();
            session.save(entity);
            transaction.commit();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return "Details of the user saved";
    }
}

