package com.core.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass {
	static Map<String, XL> m = new HashMap<>();

	public final static String prefix = "2121313sdada131saOMDfdfetretetetdfdgdgdgdvd";
	 private static List<Object> neverRead = new ArrayList<Object>();
	public static void main(String[] args) throws Exception {

		System.out.println("start");

		for (int i = 0; i < Integer.MAX_VALUE; i++) {

			String data = prefix + i;
			m.put(data, new XL());
			try {
				Thread.sleep(10000);
			} catch (OutOfMemoryError outofMemory) {
				System.out.println("Catching out of memory error");
				// Log the information,so that we can generate the statistics
				// (latter on).
				throw outofMemory;
			}
		}while(true){
			while(true)
		    {
		      neverRead.add(new Object());
		    }
		}
	}
}
