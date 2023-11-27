package com.ncs.basics;

public class AverageOfOddEvenNO {

	public static void main(String[] args) {

		int s = 0;
		int i = 1;
		int c = 0;

		while (i <= 10) {

			i++;
			s = s + i;
			i++;
			c++;
		}

		System.out.println("Average of even number is " + s / c);

		int j = 1;
		int c1 = 0;
		int s1 = 0;

		while (j <= 10) {

			s1 = s1 + j;
			j++;
			j++;
			c1++;

		}
		System.out.println("Average of Odd No. is " + s1 / c1);

	}

}