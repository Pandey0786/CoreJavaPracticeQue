package com.ncs.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BasicIteratorExample {

	public static void main(String[] args) {

		List l = new ArrayList();

		l.add("Shashank");
		l.add("Pandey");

		System.out.println(l);

		Iterator i = l.iterator();

		while (i.hasNext()) {

			System.out.println(i.next());
		}
	}

}
