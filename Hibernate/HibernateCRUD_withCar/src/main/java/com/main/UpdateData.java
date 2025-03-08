package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.CarEntity.Car;

public class UpdateData {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Car.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		// update query:update car set name='Breeza'where id=2;
		int id = 1;// update data for id 2
		Car c1 = ss.get(Car.class, id);
		// set the data according your updation
		//c1.setColor("Blue");
		c1.setColor("Blue");
		//c1.setCompany("tata");
		c1.setPrice(67000);
		c1.setFeatures("betterperform");
		//c1.setSpeed(78);
		//c1.setName("Nexon");

		// ss.update(c1);//deprecated method
		ss.merge(c1);

		tr.commit();
		System.out.println("Data is update Successfully");

		ss.close();

	}

}
