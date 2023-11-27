package com.ncs.basics;

public class LargestAndSecondLargestNOinArray {

	public static void main(String[] args) {

		int[] a = { 18, 87, 23, 101, 98 };

		int b = a[0];

		int b1 = a[0];

		for (int i = 0; i < a.length; i++) {

			if (a[i] > b) {

				b = a[i];
			}

			if (a[i] < b1) {

				b1 = a[i];
			}
		}
		System.out.println("Largest Number in the array = " + b);
		System.out.println("Smallest Number in the array = " + b1);
	}

}
