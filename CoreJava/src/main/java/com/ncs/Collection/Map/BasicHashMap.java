package com.ncs.Collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class BasicHashMap {

	public static void main(String[] args) {

		HashMap h = new HashMap();

		h.put(10, "Shashank");
		h.put(11, "Shekhar");

		System.out.println(h);

		Set s = h.entrySet();

		System.out.println(s);

		Iterator i = s.iterator();

		while (i.hasNext()) {

		//	System.out.println(i.next());

			Map.Entry e = (Map.Entry) i.next();

			System.out.println(e.getKey() + " - " + e.getValue());
		}
	}
}
