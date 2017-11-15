package com.core.basic;
	class A
	{
	    int i = 10;
	public void m()
	{
		System.out.println("m  in class A");
	}
	}
	class B extends A
	{
	    int j = 20;
	    public void m()
		{
	    	System.out.println("m  in class B");	
		}
	}
	class C extends B
	{
	    int k = 30;
	}
	public class ClassCastExceptionDemo
	{
	    public static void main(String[] args)
	    {
	        A a = new A();   //B type is auto up casted to A type
	        B b = (B) a;     //A type is explicitly down casted to B type.
	        C c = (C) b;    //Here, you will get class cast exception
	        System.out.println(c.k);
	    }
	}
