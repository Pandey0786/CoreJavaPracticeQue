package com.ncs.Collection.List;

import java.util.ArrayList;

public class PropertiesOfArrayList {

	public static void main(String[] args) {

		ArrayList al = new ArrayList(); // Here Empty Constructor will have
										// capacity for Storing elements is 10
										// which is by default

		// Initial capacity COnstructor User Defined

		ArrayList al1 = new ArrayList(9);

		// Now collection constructor Example passing
		// one ArrayList object in another constructor

		ArrayList al2 = new ArrayList();

		al2.add("Shashank");

		ArrayList al3 = new ArrayList(al2);

	}

}
