package com.ncs.OOP;

public class PersonQ3Book {

	private String fname;
	private String lname;

	public PersonQ3Book(String fn, String ln) {
		fname = fn;
		lname = ln;
	}

	public String toString() {
		return fname + lname;

	}

	public static void main(String[] args) {

		PersonQ3Book p = new PersonQ3Book("Shashank", " Pandey");
		System.out.println(p.toString());
	}

}
