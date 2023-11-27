package com.ncs.basics;

@FunctionalInterface
public interface DefaultInt {

	public void add();

	public default void defaultMeth() {

		System.out.println("Success");
	}

	public static void staticMeth() {

		System.out.println("Hello Static");
	}

}