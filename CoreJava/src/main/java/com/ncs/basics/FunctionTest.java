package com.ncs.basics;

public class FunctionTest {

	public static void main(String[] args) {

		DefaultInt.staticMeth();

		DefaultInt d = () -> {
		};
		d.defaultMeth();
		
		d.add();
	}

}
