package com.wolken.hackerrank.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernateutils {
	private static SessionFactory factory;
    private  Hibernateutils() {
    	
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
		
		return null;
	}
}