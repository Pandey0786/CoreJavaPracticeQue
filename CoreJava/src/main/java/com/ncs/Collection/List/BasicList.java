package com.ncs.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class BasicList {

	public static void main(String[] args) {

		List l = new ArrayList();

		l.add(0, 10);
		l.add(1, 30);

		System.out.println(l);
		System.out.println();

		Iterator i = l.iterator();

		while (i.hasNext()) {

			System.out.println(i.next());
		}

		System.out.println();

		ListIterator li = l.listIterator();

		while (li.hasNext()) {

			System.out.println(li.next());
		}
	}

}
