package com.core.basic;

class Subject {
	void methodOfSubject() {
		System.out.println("From Subject");
	}
}

class Physics extends Subject {
	@Override
	void methodOfSubject() {
		System.out.println("From Physics");
	}
}

class Biology extends Subject {
	@Override
	void methodOfSubject() {
		System.out.println("From Biology");
	}
}

class Botany extends Biology {
	@Override
	void methodOfSubject() {
		System.out.println("From Botany");
	}
}

class Zoology extends Biology {
	@Override
	void methodOfSubject() {
		System.out.println("From Zoology");
	}
}

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject s[] = { new Physics(), new Botany(), new Zoology(), new Biology() };
		for (int i = 0; i < s.length; i++) {
			Subject ss = (Subject) s[i];
			if (ss instanceof Subject) {
				ss.methodOfSubject();
			}
		}
	}

}
