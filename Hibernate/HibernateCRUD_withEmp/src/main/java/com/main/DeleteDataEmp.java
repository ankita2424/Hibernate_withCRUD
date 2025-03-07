package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Empentity.Employee;

//import jakarta.transaction.Transaction;


public class DeleteDataEmp {

	public static void main(String[] args) {
		//delete query:delete from employee where emp_id=2;
	 	Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		
	SessionFactory sf=cfg.buildSessionFactory();
	Session ss=sf.openSession();
	Transaction tr= ss.beginTransaction();
	
	int emp_id=5;//delete the record of emp_id is 2
	Employee e1=ss.get(Employee.class,emp_id);
	
	//ss.delete(e1); it is deprecated method
	ss.remove(e1);//it remove the data of emp_id=2;
	
	System.out.println("data is deleted");
	tr.commit();//save the changes permanently
	
	ss.close();//close the connection
	
	
	
	
	
	}

}
