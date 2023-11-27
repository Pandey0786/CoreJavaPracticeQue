package com.ncs.basics;

public class MissingNoInArray {
	
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6 };

		int[] b = { 1, 2, 3, 5, 6 };

		int s = 0;

		int s1 = 0;

		for (int i = 0; i < a.length; i++) {

			s = s + a[i];
		}

		for (int j = 0; j < b.length; j++) {

			s1 = s1 + b[j];
		}

		System.out.println(" Missing Number = "+(s - s1));
	}

}
