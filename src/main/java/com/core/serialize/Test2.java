package com.core.serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test2{

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		 
		FileInputStream f = new FileInputStream("file.ser");
		ObjectInputStream o = new ObjectInputStream(f);
		Employee e =(Employee)o.readObject();
		//Customer c =(Customer)o.readObject();
		System.out.println(e.getNames());
		System.out.println(e.getCusname());
		
	}

}
