package com.ncs.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionC1 {

	public static void main(String[] args) {

		// Creating Collection Below
		Collection c = new ArrayList();

		c.add("One Piece");
		c.add("Demon Slayer ");
		c.add("Black Clover");

		System.out.println("Length of Collection:" + c.size());

		// Printing Elements Of Collection below
		for (Object e : c) {
			System.out.println(e);
		}

		System.out.println("-------------------------------");

		// Converting Collection into Array below
		Object[] OArray = c.toArray();

		// Printing Elements Of Array
		for (Object e1 : OArray) {
			String s = (String) e1;
			System.out.println(s);
		}
	}
}
