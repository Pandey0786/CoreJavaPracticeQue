package com.ncs.basics;

public class SmallestAndLargest2 {

	public static void main(String args[]) {
		int[] a = { 10, 20, 220, 3, 77 };

		int l = a[0];

		int s = a[0];

		for (int b : a) {

			if (b > l) {

				l = b;

			} else if (s > b) {

				s = b;
			}
		}
		System.out.println("Largest   numbers is " + l);
		System.out.println("Smallest  numbers is " + s);
	}

}
