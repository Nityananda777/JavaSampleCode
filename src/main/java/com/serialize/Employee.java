package com.serialize;

import java.io.Serializable;

public class Employee extends Customer implements Serializable
{
	Employee(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 4873686581570039282L;
	private int id;
	private String name;
	private String address;
	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	public void displayData() {
		// TODO Auto-generated method stub
		System.out.println("inside displayData method ");
	}
}
