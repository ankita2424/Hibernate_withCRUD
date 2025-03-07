package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.CarEntity.Car;

public class InsertData {

	public static void main(String[] args) {

		// create the object of configuration class
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Car.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		// create the object of entity class
		Car c = new Car();
		{
			c.setName("Mercediz");
			c.setColor("White");
			c.setCompany("Tata");
			c.setPrice(1200000);
			c.setFeatures("Robust");
			c.setSpeed(100);

			ss.persist(c);//insert data into database
			tr.commit();
			System.out.println("data is inserted....");
			ss.close();// closed the connection session
		}

	}

}
