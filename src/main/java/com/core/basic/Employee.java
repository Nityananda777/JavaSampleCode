package com.core.basic;

import java.util.Date;

public class Employee {
	private int id;
	private String name;
	private int salary;
	private int age;
	private Date dateOfJoining;

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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Employee(int id, String name, int salary, int age, Date dateOfJoining) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.dateOfJoining = dateOfJoining;
	}

	@Override
	public String toString() {
		return "Employee{" + "id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + ", dateOfJoining="
				+ dateOfJoining + '}';

	}


	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Employee other = (Employee) obj;
		if (this.id != other.id) {
			return false;
		}
		if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
			return false;
		}
		if (this.salary != other.salary) {
			return false;
		}
		if (this.age != other.age) {
			return false;
		}
		if (this.dateOfJoining != other.dateOfJoining
				&& (this.dateOfJoining == null || !this.dateOfJoining.equals(other.dateOfJoining))) {

			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		int hash = 5;
		hash = 47 * hash + this.id;
		hash = 47 * hash + (this.name != null ? this.name.hashCode() : 0);
		hash = 47 * hash + this.salary;
		hash = 47 * hash + this.age;
		hash = 47 * hash + (this.dateOfJoining != null ? this.dateOfJoining.hashCode() : 0);
		return hash;
	}

}
