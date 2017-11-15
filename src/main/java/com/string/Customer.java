package com.string;

public class Customer {
	private int id;
	private String name;

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
	public int hashCode()
	{
	return 1;	
	}

	public boolean equals(Object obj) {
		Customer c = (Customer) obj;
		if (!(obj instanceof Customer)) {
			return false;
		}
		if (c.getName().equals(this.name) && c.getId() == this.id) {
			return true;
		} else {
			return false;
		}
	}
}
