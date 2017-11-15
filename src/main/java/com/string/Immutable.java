package com.string;

final class Person {

	private final String forename;
	private final String surename;
	private final int age;

	private Person(String forename, String surename, int age) {
		this.forename = forename;
		this.surename = surename;
		this.age = age;
	}

	public String getForename() {
		return forename;
	}

	public String getSurename() {
		return surename;
	}

	public int getAge() {
		return age;
	}

	public static PersonBuilder createBuilder() {
		return new PersonBuilder();
	}

	public static class PersonBuilder {

		private String forename;
		private String surename;
		private int age;

		private PersonBuilder() {

		}

		public PersonBuilder withForename(String forename) {
			this.forename = forename;
			return this;
		}

		public PersonBuilder withSurename(String surename) {
			this.surename = surename;
			return this;
		}

		public PersonBuilder withAge(int age) {
			this.age = age;
			return this;
		}

		public Person build() {
			return new Person(forename, surename, age);
		}
	}
}
	public class Immutable {

	public static void main(String[] args) {
		Person person = Person.createBuilder().withSurename("Krueger").withForename("Freddy").withAge(47).build();
		System.out.println(person.getForename());
	}
}
