package com.ncs.basics;

public class PositionOFintergerINArray2 {

	public static void main(String[] args) {

		int[] a = { 9, 8, 7, 5, 4, 3, 2, 1 };

		int b = 7;

		int index = -1;

		for (int i = 0; i < a.length; i++) {

			if (a[i] == b) {

				index = i;
			}
		}
		System.out.println("Index of " + b + " is : " + index);
	}

}
