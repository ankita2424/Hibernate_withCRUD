package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Empentity.Employee;

public class UpdateData {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		{
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(Employee.class);

			SessionFactory sf = cfg.buildSessionFactory();
			Session ss = sf.openSession();
			Transaction tr = ss.beginTransaction();
			
			int emp_id=1;
			Employee e1=ss.get(Employee.class,emp_id);
			
			e1.setCity("pune");
			e1.setDept_no(3);
			e1.setMail("abc@123");
			e1.setName("Anu");
			e1.setPassword("123abc");
			e1.setRole("Tester");
			e1.setSalary(890000);
			
			//ss.update(e1);
			ss.merge(e1);
			tr.commit();
			
			System.out.println("data is updated");
			ss.close();

		}
	}

}
