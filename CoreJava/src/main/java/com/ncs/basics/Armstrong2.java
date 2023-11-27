package com.ncs.basics;

public class Armstrong2 {

	public static void main(String[] args) {
		int start = 100;
		int end = 1000;

		for (int i = start; i <= end; i++) {
			if (isArmstrong(i)) {
				System.out.println(i);
			}
		}
	}

	// Function to check if a number is an Armstrong number
	public static boolean isArmstrong(int number) {
		int originalNumber = number;
		int sum = 0;

		while (number != 0) {
			int digit = number % 10;
			sum += Math.pow(digit, 3); // Change the power to 3 for 3-digit Armstrong numbers

			number /= 10;
		}

		return originalNumber == sum;
	}

}
