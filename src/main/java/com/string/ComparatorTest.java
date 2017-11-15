package com.string;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(101, "raja", 20, "physics");
		Employee e2 = new Employee(102, "rajesh", 22, "chemistry");
		Employee e3 = new Employee(103, "mira", 24, "biology");
		Employee e4 = new Employee(104, "shyam", 25, "math");
		Set<Employee> s=new TreeSet<Employee>();
		s.add(e1);
		s.add(e2);
		Iterator<Employee> ee=s.iterator();
		while(ee.hasNext())
		{
		Employee ee1=ee.next();	
		System.out.println(ee1.getName()+""+ee1.getAge());
		}	
		
	}
}

class Employee implements Comparable<Employee> {
	public Employee(int id, String name, int age, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dept = dept;
	}

	int id;
	String name;
	int age;
	String dept;

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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String toString() {
		return String.format("%s", id, name, age, dept);
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		int i = o.getName().compareTo(this.name);
		if (i != 0)
			return i;
		i = Integer.valueOf(o.getAge()).compareTo(this.age);
		if (i != 0)
			return i;
		return o.getDept().compareTo(this.dept);

	}

}
