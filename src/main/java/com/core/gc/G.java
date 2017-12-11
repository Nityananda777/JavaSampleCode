package com.core.gc;

import java.util.ArrayList;
import java.util.Random;

public class G {
	private static Random random = new Random();
	public static final ArrayList<Double> list = new ArrayList<Double>(1000000);

	public static void main(String[] args) throws InterruptedException {
		givenStaticField_whenLotsOfOperations_thenMemoryLeak();
	}

	public static void givenStaticField_whenLotsOfOperations_thenMemoryLeak() throws InterruptedException {
		for (int i = 0; i < 1000000; i++) {
			list.add(random.nextDouble());
		}

		System.gc();
		Thread.sleep(10000); // to allow GC do its job
	}
}
