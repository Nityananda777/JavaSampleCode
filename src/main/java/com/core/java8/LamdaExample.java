package com.core.java8;

import com.core.java8.LamdaTest1.interface1;

class LamdaTest1 {
	
	interface interface1 {
		public void display();

		default void getData() {
			System.out.println("inside data");
		}

		public static void getTotal() {
			System.out.println("getTotal data");
		}
	}
}

public class LamdaExample {

	public static void main(String[] args) {
		interface1 i = () -> {
			System.out.println("hello word");
		};
		i.display();
		i.getData();
		interface1.getTotal();
	}
}
