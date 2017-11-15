/*package net.codejava.collections;

import java.util.Comparator;

import org.apache.commons.lang3.builder.CompareToBuilder;

*//**
 * This comparator sorts a list of Employees by job title, age and salary
 * into ascending order.
 * @author www.codejava.net
 *
 *//*
public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return new CompareToBuilder()
				.append(o1.getJobTitle(), o2.getJobTitle())
				.append(o1.getAge(), o2.getAge())
				.append(o1.getSalary(), o2.getSalary()).toComparison();
	}
}*/