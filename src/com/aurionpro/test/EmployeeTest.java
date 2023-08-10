package com.aurionpro.test;

import com.aurionpro.model.Employee;
import com.aurionpro.model.child.Developer;
import com.aurionpro.model.child.Manager;

public class EmployeeTest {

	public static void main(String[] args) {

		Manager m1 = new Manager(101, "Jeena", 40000);

		printSalarySlip(m1);

		Developer d1 = new Developer(101, "Diya", 40000);

		printSalarySlip(d1);

	}

	private static void printSalarySlip(Employee employee) {

		System.out.println(employee);
		System.out.println("\n--------------------------------------------\n");

	}

}
