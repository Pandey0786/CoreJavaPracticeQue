package com.ncs.OOP.Encapsulation;

public class TestAutoMobile {

	public static void main(String[] args) {
		AutoMobile a = new AutoMobile();

		a.setColor("White");
		a.setGear(5);
		a.setSpeed(70);
		a.setMake("RE");
		System.out.println(a.getColor());
		System.out.println(a.getGear());
		System.out.println(a.getMake());
		System.out.println(a.getSpeed());
		;
	}
}
