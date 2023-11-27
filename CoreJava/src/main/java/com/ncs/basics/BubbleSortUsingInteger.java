package com.ncs.basics;

public class BubbleSortUsingInteger {

	public static void main(String[] args) {

		int[] a = { 120, 5, 50, 20, 40,12,0,1 };

		int b;

		// This For Loop Is for Rounds
		for (int i = 0; i < a.length; i++) {

			int z = 0;

			// Second for loop is for adjacent Elements comparison
			for (int j = 0; j < a.length - 1 - i; j++) {

				if (a[j] > a[j + 1]) {

					b = a[j];

					a[j] = a[j + 1];

					a[j + 1] = b;

					z = 1;
				}

			}
			if (z == 0) {

				break;
			}

		}

		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ");
		}

	}

}
