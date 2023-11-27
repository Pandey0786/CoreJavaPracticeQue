package com.ncs.basics;

public class Array2DTable {

	public static void main(String[] args) {

		int[][] a = new int[10][10];

		for (int i = 1; i <= a.length; i++) {

			for (int j = 1; j <= a.length; j++) {

				a[i - 1][j - 1] = i * j;
			}
		}
		for (int[] s : a) {

			for (int i = 1; i < s.length; i++) {

				System.out.print(s[i] + "\t");
			}

			System.out.println();
		}
	}

}
