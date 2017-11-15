package com.core.basic;

import java.util.ArrayList;
import java.util.List;

public class NoClassDefFoundErrorDueToStaticInitFailure {

	public static void main(String args[]) {

		List<User> users = new ArrayList<User>(2);

		for (int i = 0; i < 2; i++) {
			try {
				users.add(new User(i)); // will throw
														// NoClassDefFoundError
			} catch (Throwable t) {
				t.printStackTrace();
			}
		}
	}
}

class User {
	private static int USER_ID = getUserId();

	public User(int id) {
		this.USER_ID = id;
	}

	private static int getUserId() {
		throw new RuntimeException("UserId Not found");
	}
}
