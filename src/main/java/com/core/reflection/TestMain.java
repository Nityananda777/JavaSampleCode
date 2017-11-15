package com.core.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

interface X {

}

class Employee implements X {
	Employee()
	{
	System.out.println("inside employee constructor.");	
	}
	private int id;
	protected String name;

	private void setData(String name) throws RuntimeException {
		System.out.println("inside setData..."+name);
	}

	public static void setValue(int name, double x) {
		System.out.println("inside setValue");
	}
}

public class TestMain {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException,
			ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class s = Class.forName("com.core.reflection.Employee");
		Employee e = (Employee) s.newInstance();
		
		Field[] m = s.getDeclaredFields();

		for (Field f : m) {
			System.out.println("field name .." + f.getName());
			System.out.println("Data type" + f.getType().getName());
			int i = f.getModifiers();
			System.out.println("modifiers are .." + Modifier.toString(i));
			f.setAccessible(false);
			// System.out.println("field value " + f.get(f));
		}
		System.out.println("......................");
		System.out.println("......................");

		Method methods[] = s.getDeclaredMethods();
		Method mmm=s.getDeclaredMethod("setData", String.class);
		mmm.setAccessible(true);
		 mmm.invoke(e, "hello india");
		for (Method md : methods) {
			System.out.println("methods  " + md.getName());
			int i = md.getModifiers();
			System.out.println("modifiers are.." + Modifier.toString(i));

			Class c[] = md.getParameterTypes();
			for (Class c2 : c) {
				System.out.println("parameter type" + c2.getName());
			}
			
			Class c1[] = md.getExceptionTypes();
			for (Class cc : c1) {
				System.out.println("exception  type" + cc.getName());
			}
		}
		System.out.println("..................");

		System.out.println("Constructors..are");
		Constructor[] c = s.getDeclaredConstructors();
		for (Constructor ss : c) {
			System.out.println("constructor name" + ss.getName());
			int i = ss.getModifiers();
			System.out.println("Modifiers are" + Modifier.toString(i));
			//System.out.println("value "+ss.get);
			
		}
		Class[] intfs = s.getInterfaces();
		for(Class sss:intfs)
		{
		System.out.println("interfaces .."+sss.getName());
		System.out.println("interfaces .."+sss.getPackage());
		}
	}

	
}