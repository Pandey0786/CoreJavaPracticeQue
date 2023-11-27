package com.ncs.basics;

public class AmountCount2 {

	public static void main(String[] args) {

		int a = 55210;

		int[] b = { 2000, 500, 200, 100, 50, 20, 10 };

		int c = 0;

		for (int i = 0; i < b.length; i++) {

			c = a / b[i];

			System.out.println(b[i] + " = " + c);

			a = a % b[i];

		}
	}
}
