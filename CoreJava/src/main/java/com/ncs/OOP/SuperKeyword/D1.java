package com.ncs.OOP.SuperKeyword;

public class D1 extends D {

	void d() {

		System.out.println("Testing method calling through super keyword");
	}

	void test() {

		d();
		super.d(); // Here Super used to invoke Parent Class Method
	}

	public static void main(String[] args) {

		D1 d1 = new D1();

		d1.test();
	}
}
