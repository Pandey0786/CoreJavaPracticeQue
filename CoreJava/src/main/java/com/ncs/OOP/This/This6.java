package com.ncs.OOP.This;
// Here this keyword is use to return the current class instance 
 // from the method
public class This6 {

	This6 m1() {

		return this;
	}

	public static void main(String[] args) {

		This6 th6 = new This6();

		System.out.println(th6.m1());
	}
}
