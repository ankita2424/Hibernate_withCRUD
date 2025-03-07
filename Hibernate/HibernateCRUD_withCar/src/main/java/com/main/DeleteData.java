package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.CarEntity.Car;

public class DeleteData {

	public static void main(String[] args) {

		// create object of configuration class
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Car.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int id = 2;// delete the record from carid2
		Car c = ss.get(Car.class, id);

		// ss.delete(c); this method is deprecated
		ss.remove(c);// it is currently used
		tr.commit();
		System.out.println("Data is deleted");
		ss.close();

	}

}
