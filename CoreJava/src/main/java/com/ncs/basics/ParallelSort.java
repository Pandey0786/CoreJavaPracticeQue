package com.ncs.basics;

import java.util.Arrays;

public class ParallelSort {

	public static void main(String[] args) {
		int[] arr = { 5, 8, 2, 4, 1 };

		for (int i : arr) {
			System.out.print(i + " ");
		}
		Arrays.parallelSort(arr);
		System.out.println("\narray after parallelshot");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
