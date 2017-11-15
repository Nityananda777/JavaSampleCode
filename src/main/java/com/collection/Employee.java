package com.collection;

import java.util.Date;

public class Employee implements Comparable<Employee> {

	
	public Employee() {
	}

	public Employee(int empId, String name, double salary, Date dateOfJoining) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
	}

	private int empId;
	private String name;
	private double salary;
	private Date dateOfJoining;

	public int compareTo(Employee o) {
		if (o == null) {
			throw new NullPointerException("compareTo: Argument passed is null");
		}
		if (this.getClass().equals(o.getClass())) {
			Employee e = (Employee) o;
			return this.getName().compareTo(e.getName());
		} else {
			throw new ClassCastException("compareTo: Objects are not comparable");
		}
	}

	// setters and getters
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	
}
