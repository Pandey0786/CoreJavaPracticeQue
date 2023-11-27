package com.ncs.Collection.Set;

import java.util.Iterator;

public class TreeSet0 {

	public static void main(String[] args) {

		java.util.TreeSet s = new java.util.TreeSet();
		s.add("Zero");
		s.add("One");
		s.add("Two");
		s.add("Three");

		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			String str = (String) itr.next();
			System.out.println(str);
		}
	}
}
