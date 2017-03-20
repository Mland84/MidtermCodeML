package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class Staff_Test {

	static ArrayList<Employee> EmployeeList = new ArrayList<Employee>(5);

	public static double addToEmployee() {
		double sum = 0;
		Employee p1 = new Employee();
		p1.setSalary(5.6);
		Employee p2 = new Employee();
		p2.setSalary(6.5);
		Employee p3 = new Employee();
		p3.setSalary(7.3);
		Employee p4 = new Employee();
		p4.setSalary(8.1);
		Employee p5 = new Employee();
		p5.setSalary(9.0);

		EmployeeList.add(p1);
		EmployeeList.add(p2);
		EmployeeList.add(p3);
		EmployeeList.add(p4);
		EmployeeList.add(p5);

		for (Employee p : EmployeeList) {

			sum += p.getSalary();

		}
		double average= sum / EmployeeList.size();
		return average;
		
		
	}

	@BeforeClass
	public static void setup() {
	}

	
	@Test
	public void test() {
		
		assertEquals(addToEmployee(), 7.3,.001);
	}
	@Test
	public void testPhoneNumException() throws PersonException {
		
		
		Employee p6 = new Employee();
		p6.setPhone("302.3769871");
		p6.checkPhone(p6);
		}
	@Test
	public void testDOBException() throws PersonException {
		Employee p7 = new Employee();
	
	}
	
	
}
