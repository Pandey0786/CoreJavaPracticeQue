package com.ncs.OOP.Polymorphism;

public class MethodOverloading {

	public void Bike(String a) {

		System.out.println("BIKE IS BIKE");

	}

	public void Bike(int c) {

		System.out.println("DUKE IS 390");
	}

	public static void main(String[] args) {

		MethodOverloading md = new MethodOverloading();

		md.Bike("bullet");
		md.Bike(10);
	}
}
