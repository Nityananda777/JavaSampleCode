package com.core.classLoader;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ClassLoaderExample {

	public static void main(String[] args) {
		try {
			// printing ClassLoader of this class
			System.out.println(
					"ClassLoaderTest.getClass().getClassLoader() : " + ClassLoaderExample.class.getClassLoader());

			System.out.println(ClassLoaderExample.class.getClassLoader().getParent());
			// trying to explicitly load this class again using Extension class
			// loader
			Class.forName("test.ClassLoaderTest", true, ClassLoaderExample.class.getClassLoader().getParent());
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(ClassLoaderExample.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

}
