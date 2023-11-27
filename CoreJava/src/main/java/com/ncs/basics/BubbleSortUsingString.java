package com.ncs.basics;

public class BubbleSortUsingString {
	
	public static void main(String[] args) {

		String[] a = { "Shashank", "Sagar", "Achal", "Jaiveer", "Rohan" , "Sahil" };

		String b;

		// This For Loop Is for Rounds
		for (int i = 0; i < a.length; i++) {

			int z = 0;

			// Second for loop is for adjacent Elements comparison
			for (int j = 0; j < a.length - 1 - i; j++) {

				if (a[j].compareTo(a[j + 1])>0) {

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
