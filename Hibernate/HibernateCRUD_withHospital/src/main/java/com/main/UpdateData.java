package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.HospitalEntity.Hospital;

public class UpdateData {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Hospital.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int Hos_id = 1;
		Hospital h = ss.get(Hospital.class, Hos_id);
		h.setName("Lonkar");
		h.setEmail("lonakr@123");

		ss.merge(h);
		tr.commit();
		System.out.println("Data is updated...");
		ss.close();

	}

}
