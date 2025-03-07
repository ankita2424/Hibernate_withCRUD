package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.HospitalEntity.Hospital;

public class InsertData {

	public static void main(String[] args) {
		// create the object of configuration class
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Hospital.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		// create the object of entity class
		Hospital h = new Hospital();
		h.setName("Kem");
		h.setCapacity(89);
		h.setEmail("moraya123@gmail.com");
		h.setLocation("pune");
		h.setMob_no(895677349);
		h.setType("govern");
		h.setWebsite("www.moryahospital.com");

		ss.persist(h);// insert the value in database
		tr.commit();// save the changes
		System.out.println("Data is inserted successfully");

		ss.close();// close the connection

	}

}
