//package net.codejava.collections;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//import org.apache.commons.lang3.builder.CompareToBuilder;
//
///**
// * This program demonstrates how to sort a list collection by multiple
// * attributes using a CompareToBuilder of the Apache Commons Lang library.
// *
// * @author www.codejava.net
// *
// */
//public class SortingMultipleAttributesCommonsLangExample {
//
//	public static void main(String[] args) {
//
//		System.out.println("===== SORTING ON MULTIPLE ATTRIBUTES USING APACHE COMMONS LANG =====");
//
//		List<Employee> listEmployees = new ArrayList<Employee>();
//
//		listEmployees.add(new Employee("Tom", "Developer", 45, 80000));
//		listEmployees.add(new Employee("Sam", "Designer", 30, 75000));
//		listEmployees.add(new Employee("Bob", "Designer", 45, 134000));
//		listEmployees.add(new Employee("Peter", "Programmer", 25, 60000));
//		listEmployees.add(new Employee("Tim", "Designer", 45, 130000));
//		listEmployees.add(new Employee("Craig", "Programmer", 30, 52000));
//		listEmployees.add(new Employee("Anne", "Programmer", 25, 51000));
//		listEmployees.add(new Employee("Alex", "Designer", 30, 120000));
//		listEmployees.add(new Employee("Bill", "Programmer", 22, 30000));
//		listEmployees.add(new Employee("Samuel", "Developer", 28, 80000));
//		listEmployees.add(new Employee("John", "Developer", 35, 67000));
//		listEmployees.add(new Employee("Patrick", "Developer", 35, 140000));
//		listEmployees.add(new Employee("Alice", "Programmer", 35, 80000));
//		listEmployees.add(new Employee("David", "Developer", 35, 99000));
//		listEmployees.add(new Employee("Jane", "Designer", 30, 82000));
//
//		System.out.println("Before sorting:");
//
//		for (Employee emp : listEmployees) {
//			System.out.println(emp);
//		}
//
//		Collections.sort(listEmployees, new EmployeeComparator());
//
//		System.out.println("\nAfter sorting:");
//
//		for (Employee emp : listEmployees) {
//			System.out.println(emp);
//		}
//
//	}
//}