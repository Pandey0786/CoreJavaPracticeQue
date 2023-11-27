package com.ncs.Collection;

import java.util.*;

public class CreatingCollectionWays {

	public static void main(String[] args) {

		/*
		 * For creating collection we have two options
		 * 
		 * But as per our application Requirement
		 * 
		 */

		// 1- Type Safe

// Because it is type safe so other values cannot be stored
// which are defined in its generic
// or we can say the Diamond Operator - <>

		ArrayList<String> a = new ArrayList<>();

		a.add("Monkey D Luffy");
		a.add("Roronoa Zoro");
		a.add("Trafalgar D WaterLaw");

		System.out.println(a);
		System.out.println(a.get(2));

		System.out.println("************");

		// 2- UnType Safe

// Here multiple values can be Stored in this 		

		List l = new ArrayList();

		l.add("Portgas D Ace");
		l.add(1, "Sabo");
		l.add(2929292.29292929);
		l.addAll(a);

		System.out.println(l);

	}

}
