package com.core.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinMaxExample {
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<Employee>();

		emps.add(new Employee(1, "Lokesh", 36));
		emps.add(new Employee(2, "Alex", 46));
		emps.add(new Employee(3, "Brian", 52));
		emps.add(new Employee(3, "Nitya", 31));
		emps.add(new Employee(3, "Tasnim", 28));
		emps.add(new Employee(3, "Chiku", 30));
		emps.add(new Employee(3, "Chandan", 29));

		// Comparator<Employee> comparator = Comparator.comparing(Employee::getAge);

		Comparator<Employee> comparator = Comparator.comparing(t -> {
			// TODO Auto-generated method stub
			Employee e1 = (Employee) t;
			return e1.getAge();
		});
		// Get Min or Max Object
		Employee minObject = emps.stream().min(comparator).get();
		Employee maxObject = emps.stream().max(comparator).get();

		System.out.println("minObject = " + minObject);
		System.out.println("maxObject = " + maxObject);

		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(6);
		intList.add(7);
		intList.add(8);
		intList.add(9);

		// Get Min or Max Number
		//Integer maxNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).max(Comparator.comparing(Integer::valueOf)).get();
		//Integer minNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).min(Comparator.comparing(Integer::valueOf)).get();

		Integer maxNumber = intList.stream().max(Comparator.comparing(Integer::valueOf)).get();
		Integer minNumber = intList.stream().min(Comparator.comparing(Integer::valueOf)).get();
		
		System.out.println("maxNumber = " + maxNumber);
		System.out.println("minNumber = " + minNumber);
	}
}

class Employee {
	private int id;
	private String name;
	private int age;

	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		StringBuilder str = null;
		str = new StringBuilder();
		str.append("Id:- " + getId() + " Name:- " + getName() + " Age:- " + getAge());
		return str.toString();
	}
}
