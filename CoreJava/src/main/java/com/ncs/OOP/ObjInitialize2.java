package com.ncs.OOP;

public class ObjInitialize2 {
	
	String color;
	int age;
	
	public void byMethod(String a, int b) {
		
		color = a;
		age = b;
	}
	
	public void display() {
		
		System.out.println(color + " " + age);
	}
	
	public static void main(String[] args) {
		
		ObjInitialize2 obj2 = new ObjInitialize2();
		
		obj2.byMethod("KAlU", 19);
		obj2.display();
	}

}
