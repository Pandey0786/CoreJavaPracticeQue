package com.ncs.Collection.List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class BasicListIterator {

	public static void main(String[] args) {

		List l = new ArrayList();

		l.add("Shashank");
		l.add("Pandey");

		System.out.println(l);
		System.out.println();

		ListIterator i = l.listIterator();

		while (i.hasNext()) {

			System.out.println(i.next());
		}

		System.out.println();

		while (i.hasPrevious()) {

			System.out.println(i.previous());
		}

	}
}
