package com.ncs.basics;

public class AmountFind {

	public static void main(String[] args) {

		int a = 1020;
		int c = 0;

		int[] b = { 2000, 1000, 500, 200, 100, 50, 20, 10 };

		for (int i = 0; i < b.length; i++) {

			c = a / b[i];

			a -=c * b[i];

			System.out.println(b[i] + " = " + c);

		}

	}
}
