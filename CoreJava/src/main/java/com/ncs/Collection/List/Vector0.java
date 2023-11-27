package com.ncs.Collection.List;

import java.util.*;

public class Vector0 {

	public static void main(String[] args) {

		Vector l = new Vector();

		l.add("One");
		l.add("Two");
		l.add(1);
		l.add(null);

		Iterator it = l.iterator();

		while (it.hasNext()) {

			// String str = (String) it.next();
			System.out.println(it.next());
		}

		Enumeration en = l.elements();

		while (en.hasMoreElements()) {

			// String str = (String) en.nextElement();
			System.out.println(en.nextElement());
			// System.out.println(str);
		}
	}
}
