package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Empentity.Employee;

//import jakarta.transaction.Transaction;

public class InsertDataEmp {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Employee e = new Employee();
		// e.setEmp_id(8);
		e.setName("Rahul");
		e.setMail("Ram@123gmail.com");
		e.setPassword("Ram123");
		e.setRole("Devloper");
		e.setCity("Mumbia");
		e.setSalary(45679);
		e.setDept_no(1);
		ss.save(e);

		tr.commit();
		System.out.println("data is inserted");
		ss.close();
		

	}

}
