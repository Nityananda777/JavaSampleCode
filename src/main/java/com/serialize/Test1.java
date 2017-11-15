package com.serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test1{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Employee e = new Employee("hh");
		e.setAddress("mumbai");
		e.setId(101);
		e.setName("raja");
		Customer c=new Customer("jj");
		c.setChome("mumbai");
		c.setCusname("ram");
		c.setCustId(1012);
		FileOutputStream f = new FileOutputStream("file.ser");
		ObjectOutputStream o = new ObjectOutputStream(f);
		o.writeObject(e);
		System.out.println("serilization done..");
	}

}
