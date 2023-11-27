package com.ncs.Collection.StreamApi;

import java.util.*;

public class FindingDuplicate2 {

	static Set s = new HashSet<>();

	public static boolean isDuplicate(String x) {

		if (s.add(x) == false) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {

		ArrayList<String> l = new ArrayList<>();

		l.add("abhishek");
		l.add("abhishek");
		l.add("rohit");
		l.add("mohit");

		l.stream().filter(e -> isDuplicate(e)).forEach(e -> System.out.println(e));

	}

}
