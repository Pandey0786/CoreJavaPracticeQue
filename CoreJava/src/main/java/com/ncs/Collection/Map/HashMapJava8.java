package com.ncs.Collection.Map;

import java.util.*;

public class HashMapJava8 {

	public static void main(String[] args) {

		HashMap<String, Integer> h = new HashMap<>();

		h.put("WhiteBeard", 72);
		h.put("Gold D Roger", 50);
		h.put("Senju Hashirama", 100);

		System.out.println(h);
		System.out.println();

// Here by using java 8 For each interface Bi-consumer Functional Interface 
// Method in key value pair will be retrieve the data

		h.forEach((key, value) -> {

			System.out.print(key);
			System.out.print(" = ");
			System.out.println(value + "\n");

		});

	}

}
