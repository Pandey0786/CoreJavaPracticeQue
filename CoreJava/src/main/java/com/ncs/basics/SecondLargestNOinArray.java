package com.ncs.basics;

public class SecondLargestNOinArray {

	public static void main(String[] args) {

		int[] arr = { 18, 870, 1230, 101, 98 };

		int n1 = 0;

		int n2 = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > n2) {

				n1 = n2;

				n2 = arr[i];

			} else if (n1 < arr[i] && arr[i] < n2) {

				n1 = arr[i];
			}
		}
		System.out.println("second largest number = " + n1);
	}
	
}
