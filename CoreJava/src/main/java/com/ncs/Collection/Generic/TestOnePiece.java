package com.ncs.Collection.Generic;

/*
 * Here in this class I have created 2 objects of main class 
 *  first one is for String and second one is for Integer
 *  and when we pass the we pass the values in the constructor
 *  at that time P in the main class generic will be different 
 *  
 *   for both the Object data type and we may be able to make our 
 *   program type safe also 
 *   
 *   so in this class String and Integer type values are given and get their 
 *   type from from which class they have been called
 */

public class TestOnePiece {

	public static void main(String[] args) {

		Onepiece<String> op = new Onepiece<>("The 5th Emperor of the Sea");

		System.out.println(op.getValue() + "\n");

		System.out.println(op.luffy.getClass().getName() + "\n");

		Onepiece<Integer> op1 = new Onepiece<>(19);

		System.out.println("Age of Luffy = " + op1.getValue() + "\n");

		System.out.println(op1.luffy.getClass().getName() + "\n");

		op.CheckIntegerOrString();

		op1.CheckIntegerOrString();

	}
}
