package com.ncs.OOP.Constructor;

// Here Constructor Overloading Concept IS Also Used

public class SameConstructorCall {

	private int age;
	private String name;
	private String address;

	public SameConstructorCall() {
	}

	public SameConstructorCall(int age, String name) {
		this(); // Here this keyword is used to call default constructor
		this.age = age;
		this.name = name;

	}

	public SameConstructorCall(int age, String name, String address) {
		this(age, name); // Here this keyword is used to call the 2Paramererized constructor
		this.age = age;
		this.name = name;
		this.address = address;

	}

	public int getage() {
		return age;
	}

	public String getname() {
		return name;
	}

	public String getaddress() {
		return address;
	}

	public static void main(String[] args) {
		SameConstructorCall s = new SameConstructorCall(24, "Shashank", "Indore");
		System.out.println(s.getaddress());
		System.out.println(s.getname());
		System.out.println(s.getage());

	}
}
