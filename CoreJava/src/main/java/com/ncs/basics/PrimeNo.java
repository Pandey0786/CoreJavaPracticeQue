package com.ncs.basics;

public class PrimeNo {

	public static void main(String[] args) {

		int num = 5;

		int count = 0;

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {
				count++;}
		}
		if (count == 0) {
			System.out.println("Yes, Prime Number");
		} else {
			System.out.println("Not, Prime Number");
		}

	}

}
