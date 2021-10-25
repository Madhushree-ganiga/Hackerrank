package com.wolken.Flipcart.utils;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class HibernateUtils {
    private static SessionFactory factory;
    private HibernateUtils() {
    }

    static public SessionFactory getFactory(){
        if (factory==null){
            Configuration configuration=new Configuration();
            configuration.configure();
            factory=configuration.buildSessionFactory();
        }
        return factory;
    }

    static public void closeFactory(){
        factory.close();
    }

	public static SessionFactory getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
}