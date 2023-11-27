package com.ncs.Collection.StreamApi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Below Program is for creating a list and Filter All even No.
// Comparing Between Without using Stream Api and With Using It

public class Comparison {

	public static void main(String[] args) {

		List<Integer> l1 = List.of(2, 8, 9, 7, 6);

		List<Integer> l2 = new ArrayList<>();

		l2.add(91);
		l2.add(97);
		l2.add(99);
		l2.add(89);

		List<Integer> l3 = Arrays.asList(999, 55, 66, 77, 44);

		// Without Stream

		List<Integer> l4 = new ArrayList<>();

		for (Integer a : l1) {

			if (a % 2 == 0) {

				l4.add(a);
			}
		}

		System.out.println(l1);
		System.out.println(l4);

		// Using Stream

		Stream<Integer> s1 = l1.stream();

		List<Integer> l5 = s1.filter(a -> a % 2 == 0).collect(Collectors.toList());

		// System.out.println(l5);

		List<Integer> l6 = l1.stream().filter(b -> b % 2 == 0).collect(Collectors.toList());

		// System.out.println(l6);

		List<Integer> l7 = l1.stream().filter(c -> c > 5).collect(Collectors.toList());

		System.out.println(l7);
	}

}
