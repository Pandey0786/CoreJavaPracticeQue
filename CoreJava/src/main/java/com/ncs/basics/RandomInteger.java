package com.ncs.basics;

public class RandomInteger {
	
	public static void main(String[] args) {

		for (int i = 10; i < 15; i++) {

			int x = (int) (Math.random() * 100);

			System.out.println(x + "\n");
			
		}
	}

}
