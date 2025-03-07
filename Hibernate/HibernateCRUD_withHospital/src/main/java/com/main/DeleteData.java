package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.HospitalEntity.Hospital;

public class DeleteData {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");//xml file name
		cfg.addAnnotatedClass(Hospital.class);//connect data to the entity class

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		//it is primary key
		int Hos_id =2;//delete the record of hos_id=2
		Hospital h=ss.get(Hospital.class,Hos_id);
		
		ss.remove(h);
		tr.commit();//save the data 
		System.out.println("Data is deleted");//display message on console
		ss.close();//close the connection

	}

}
