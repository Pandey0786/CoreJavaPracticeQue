package com.ncs.basics;

public class StarTriangle {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i+=2) {

			for (int j = 5; j > i; j--) {

				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {

				System.out.print("* ");
			}

			System.out.println();
		}

	}

}
