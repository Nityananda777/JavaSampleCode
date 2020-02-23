package com.core.basic;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

	public static final Comparator<Employee> AgeComparator = (o1, o2) -> {
		return o1.getAge() - o2.getAge(); // This will work because age is
											// positive integer
	};
	public static final Comparator<Employee> SalaryComparator = (o1, o2) -> {
		return o1.getSalary() - o2.getSalary(); // salary is also positive
												// integer
	};
	public static final Comparator<Employee> NameComparator = (o1, o2) -> o1.getName().compareTo(o2.getName());

	public static final Comparator<Employee> DOJComparator = (o1, o2) -> o1.getDateOfJoining().compareTo(o2.getDateOfJoining());

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getId() - o2.getId();
	}

}
