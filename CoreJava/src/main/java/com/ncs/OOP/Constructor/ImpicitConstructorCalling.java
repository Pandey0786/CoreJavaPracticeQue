package com.ncs.OOP.Constructor;

public class ImpicitConstructorCalling {

	public String name;
	public String Address;
	
	public ImpicitConstructorCalling() {
		System.out.println("calling");
	}
	
	public ImpicitConstructorCalling(String a, String b) {
		
		name = a;
		Address = b;
		
		System.out.println("ExlicitCalling");
	}
	
	public static void main(String[] args) {
		
		new ImpicitConstructorCalling();
	}
}
