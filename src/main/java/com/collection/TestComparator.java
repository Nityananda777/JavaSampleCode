package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public abstract class TestComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(101, "raja", 101.8, new Date());
		Employee e2 = new Employee(102, "rajesh", 102.8, new Date());
		Employee e3 = new Employee(103, "chandan", 103.8, new Date());
		Employee e4 = new Employee(104, "nitya", 104.8, new Date());
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		Collections.sort(list, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {

				if (o1.getEmpId() > o2.getEmpId()) {
					return 1;
				} else if (o2.getEmpId() > o1.getEmpId()) {
					return -1;
				}
				return o1.getName().compareTo(o2.getName());
			}
		});
		for (Employee e : list) {
			System.out.println(e.getEmpId());
			System.out.println(e.getName());
			System.out.println(e.getSalary());
		}
	}

}
