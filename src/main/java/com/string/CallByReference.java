package com.string;

public class CallByReference {
	public static void main(String args[]) {
		Animal a = new Animal("Lion");
		System.out.println("Before Modify: " + a);
		Animal.modify(a);
		System.out.println("After Modify: " + a);
	}
}

class Animal {
	public static void modify(Animal animal) {
		animal.setName("Tiger");
	}
	String name;

	public Animal(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
