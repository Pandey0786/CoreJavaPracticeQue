package com.ncs.OOP.Constructor;

//Here this keyword is use to call the current class instance variable
//And this class is used by Employee class for Explicit parameterized
//Constructor calling

public class Person {

	public String name;
	public String address;

	public Person(String a, String b) {

		this.name = a;
		this.address = b;
	}

	public static void main(String[] args) {

		Person p = new Person("Shashank", "Pandey");

		System.out.println(p.address + p.name);

	}
}
