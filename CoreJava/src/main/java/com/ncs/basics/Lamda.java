package com.ncs.basics;

import java.util.Arrays;

interface Addable {

	int add(int f, int b, int c);

}

public class Lamda {

	public static void main(String[] args) {
    
		int[] arr = { 1, 2 };

		Arrays.asList(arr).stream().forEach(e -> {
			System.out.println(e);
		});

		System.out.println();

		for (int string : arr) {

			System.out.println(string);
		}

		System.out.println();

		Integer[] a = { 1, 2, 3 };

		Arrays.asList(a).forEach(e -> {
			System.out.println(e);
		});

		System.out.println();

		Addable r = (f, b, c) -> {
			return (f + b + c);
		};

		System.out.println(r.add(6, 7, 8));
	}

}
