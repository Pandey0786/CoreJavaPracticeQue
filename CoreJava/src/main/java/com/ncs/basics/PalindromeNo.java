package com.ncs.basics;

public class PalindromeNo {

	public static void main(String[] args) {

		int a = 101;
		int b = a;
		int c = 0;
		int d;

		while (b > 0) {

			d = b % 10;

			c = c * 10 + d;

			b = b / 10;
		}
		if (a == c) {
			System.out.println("Yes, Number is Palindrome");
		} else {
			System.out.println("Not, Palindrome Number");
		}
	}

}
