package com.org.xworkz.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.org.xworkz.entity.ValentineEntity;

//@Component
public class DAOImpl implements ValentineDAO {

	public DAOImpl() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	public Integer save(ValentineEntity Entity) {

		try {
			Configuration con = new Configuration();
			con.configure("resources/mysql.xml");
			SessionFactory factory = con.buildSessionFactory();
			Session session;
			System.out.println("session created");
			session = factory.openSession();
			System.out.println("Transaction begun");
			session.beginTransaction();
			System.out.println("Entity saving...");
			session.save(Entity);
			System.out.println("Commiting....");
			session.getTransaction().commit();
			System.out.println("Data saved");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("INFO:" + e.getMessage());
		}
		return null;
	}

}
