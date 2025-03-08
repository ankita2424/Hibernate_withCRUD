package com.main;

import java.util.List;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
import org.hibernate.query.criteria.JpaCriteriaQuery;

import com.HospitalEntity.Hospital;
import jakarta.persistence.criteria.Root;

public class GetAllRecord {

	private static Query query;
	private static org.hibernate.query.Query<Object> Query;

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		{
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(Hospital.class);

			SessionFactory sf = cfg.buildSessionFactory();
			Session ss = sf.openSession();
			Transaction tr = ss.beginTransaction();

			// select * from Employee
			HibernateCriteriaBuilder hcb = ss.getCriteriaBuilder();
			JpaCriteriaQuery<Object> cq = hcb.createQuery();
			Root<Hospital> root = cq.from(Hospital.class);

			cq.select(root);

			Query<Object> query = ss.createQuery(cq);
			List<Object> list = query.getResultList();

			for (Object Hospital : list) {
				System.out.println(Hospital);

			}

		}

	}

}
