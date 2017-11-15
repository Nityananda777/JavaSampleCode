package com.core.basic;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Course implements Serializable,Cloneable{
	String subject1;

	String subject2;

	String subject3;

	public Course(String sub1, String sub2, String sub3) {
		this.subject1 = sub1;

		this.subject2 = sub2;

		this.subject3 = sub3;
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class Student implements Cloneable,Serializable {
	int id;

	String name;

	Course course;

	public Student(int id, String name, Course course) {
		this.id = id;

		this.name = name;

		this.course = course;
	}

	// Default version of clone() method. It creates shallow copy of an object.

	protected Object clone() throws CloneNotSupportedException {
		Student s = (Student) super.clone();
		s.course = (Course) course.clone();
		return s;
	} 

	protected Student depCopy(Object obj) throws IOException, ClassNotFoundException {
		ByteArrayOutputStream b = new ByteArrayOutputStream();
		ObjectOutputStream o = new ObjectOutputStream(b);
		o.writeObject(obj);
		ByteArrayInputStream bb = new ByteArrayInputStream(b.toByteArray());
		ObjectInputStream in = new ObjectInputStream(bb);
		return (Student)in.readObject();
	}
}

public class ShallowCopyInJava {
	public static void main(String[] args) throws  IOException, ClassNotFoundException {
		Course science = new Course("Physics", "Chemistry", "Biology");

		Student student1 = new Student(111, "John", science);

		Student student2 = null;

		student2 = (Student) student1.depCopy(student1);

		// Printing the subject3 of 'student1'

		System.out.println(student1.course.subject3); // Output : Biology

		// Changing the subject3 of 'student2'

		student2.course.subject3 = "Maths";

		// This change will be reflected in original student 'student1'

		System.out.println(student1.course.subject3); // Output : Maths
		System.out.println(student2.course.subject3);
	}
}