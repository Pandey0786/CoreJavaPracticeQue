package com.ncs.Collection;

import java.util.*;

public class TraversingTypesInCollection {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<>();

		a.add("Monkey D Luffy");
		a.add("Roronoa Zoro");
		a.add("Trafalgar D WaterLaw");

		// 1) For each loop

		System.out.println(" Here For Each Traversing Below" + "\n");

		for (String s : a) {

			System.out.print(s + "\t" + s.length() + "\t");

			StringBuffer sb = new StringBuffer(s);

			System.out.println(sb.reverse());
		}

		// 2) Iterator

		System.out.println();
		System.out.println(" Here Iterator Traversing Below" + "\n");

		Iterator<String> i = a.iterator();

		while (i.hasNext()) {

			String s1 = (String) i.next();
			System.out.println(s1);
		}

		// 3) List Iterator

		System.out.println();
		System.out.println(" Here List Iterator Traversing Below Previous" + "\n");

		ListIterator<String> l = a.listIterator(a.size());

		while (l.hasPrevious()) {

			String s2 = l.previous();
			System.out.println(s2);
		}

		// 4) For Each method Java 8 feature

		System.out.println();
		System.out.println(" Here using Functional Interface method "
		+ "and by usig Lamda Traversing Shown Below " + "\n");

		a.forEach(e -> {

			System.out.println(e);
		});

	}

}
