package com.ncs.OOP.SuperKeyword;

// Super Keyword here USed to refer Parent Class Instance Variable
public class B extends A {

	int a = 20;

	void show(int a) {

		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}

	public static void main(String[] args) {

		B b = new B();

		b.show(100);
	}
}
