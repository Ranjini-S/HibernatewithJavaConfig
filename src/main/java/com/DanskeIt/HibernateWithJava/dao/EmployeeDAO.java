package com.DanskeIt.HibernateWithJava.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.DanskeIt.HibernateWithJava.model.Employee;
import com.DansktIt.HibernateWithJava.util.HibernateUtil;

public class EmployeeDAO {

	public void saveEmployee(Employee employee) {

		Transaction transaction = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start the transaction
			transaction = session.beginTransaction();

			// save object
			session.save(employee);

			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null)
				transaction.rollback();
		}
	}
}
