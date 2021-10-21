package com.wolken.butterflys;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wolken.butterflys.entity.ButterFlyDTO;


public class Butterfly {
	public static void main(String[] args) {
        Configuration configuration=new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory factory= configuration.buildSessionFactory();
        Session session= factory.openSession();
        ButterFlyDTO dto=(ButterFlyDTO)session.get(ButterFlyDTO.class,2);
        System.out.println(dto);
        session.close();
        factory.close();
    }
}
