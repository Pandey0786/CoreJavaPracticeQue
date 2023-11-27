package com.ncs.Collection;

import java.util.ArrayList;

public class CollectionC0 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(10);
		al.add("Shashank");

		System.out.println(al);

		ArrayList al1 = new ArrayList();
		
		al1.add("Pandey");
		
		al.addAll(al1);
		System.out.println(al);
 	}
}
