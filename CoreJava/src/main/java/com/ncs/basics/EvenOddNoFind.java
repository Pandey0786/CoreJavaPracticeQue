package com.ncs.basics;

public class EvenOddNoFind {

	public static void main(String[] args) {

		int s = 0;
		int b1 = 0;

		for (int i = 1; i <= 10; i++) {

			if (i % 2 == 0) {

				b1 = i;

				System.out.println(b1);
				

				s = s + i;
			}
		}

		System.out.println("Total of Even No =" + s);
		System.out.println();

		int s1 = 0;
		int b2 = 0;

		for (int i = 1; i <= 10; i++) {

			if (i % 2 == 1) {

				b2 = i;

				System.out.println(b2);
                
				
                s1 = s1 + i;
			}
		}

		System.out.println("Total of Odd No =" + s1);

	}

}
