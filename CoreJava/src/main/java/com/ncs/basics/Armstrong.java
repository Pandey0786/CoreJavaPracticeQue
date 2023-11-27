package com.ncs.basics;

public class Armstrong {
	
	public static void main(String[] args) {
		
		int a = 153;
		int b = a;
		int c = 0;
		int d;

		while (b > 0) {

			d = b % 10;
			c = c + d * d * d;
			b = b / 10;
		}
		if (a == c) {
			System.out.println("Yes, Armstrong Number");
		} else {
			System.out.println("Not Armstron Number");
		}
		
	}

}
