package com.DanskeIt.HibernateWithJava;

import com.DanskeIt.HibernateWithJava.dao.EmployeeDAO;
import com.DanskeIt.HibernateWithJava.model.Employee;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee = new Employee ("Ranjini","S",1345);
		
		EmployeeDAO employeeDAO = new EmployeeDAO();
		
		employeeDAO.saveEmployee(employee);
		
		System.out.println(employee.getEmployeeId());
	}

}

