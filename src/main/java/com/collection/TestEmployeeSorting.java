package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class TestEmployeeSorting {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "A", 20000.00, new Date(2010, 12, 11));
		Employee e2 = new Employee(2, "A", 22000.00, new Date(2009, 12, 11));
		Employee e3 = new Employee(3, "A", 10000.00, new Date(1990, 12, 11));
		Employee e4 = new Employee(4, "F", 19000.00, new Date(2001, 12, 11));
		Employee e5 = new Employee(5, "E", 24000.00, new Date(2006, 12, 11));
		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		// PRINT BEFORE SORTING
		System.out.println("BEFORE SORTING");
		System.out.println("===============================================================");
		System.out.println("ID  Name  Salary  Date Of Joining");
		System.out.println("===============================================================");
		for (Employee employee : list) {
			System.out.println(employee.getEmpId() + "\t\t " + employee.getName() + "\t\t" + employee.getSalary()
					+ "\t\t " + employee.getDateOfJoining().getDay() + "-" + employee.getDateOfJoining().getMonth()
					+ "-" + employee.getDateOfJoining().getYear());
		}

		// sorting the Employee object
		Collections.sort(list);
		// PRINT AFTER SORTING
		System.out.println("\n\nAFTER SORTING");
		System.out.println("===============================================================");
		System.out.println("ID  Name  Salary  Date Of Joining");
		System.out.println("===============================================================");
		for (Employee employee : list) {
			System.out.println(employee.getEmpId() + "\t\t " + employee.getName() + "\t\t" + employee.getSalary()
					+ "\t\t " + employee.getDateOfJoining().getDay() + "-" + employee.getDateOfJoining().getMonth()
					+ "-" + employee.getDateOfJoining().getYear());
		}
	}
}
