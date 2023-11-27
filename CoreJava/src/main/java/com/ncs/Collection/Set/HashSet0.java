package com.ncs.Collection.Set;

import java.util.*;

public class HashSet0 {

	public static void main(String[] args) {

		HashSet h = new HashSet();
		h.add("One");
		h.add("two");
		h.add("three");
		h.add("four");
		h.add("five");

		Iterator itr = h.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			h.add("a");
		}
	}
}
