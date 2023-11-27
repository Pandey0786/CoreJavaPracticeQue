package com.ncs.OOP;

public class ObjInitialize1 {

	String color;
	int age;

	public static void main(String[] args) {

		ObjInitialize1 obj1 = new ObjInitialize1();

		obj1.age = 40;
		obj1.color = "blue";

		System.out.println(obj1.color + " " + obj1.age);

	}

}
