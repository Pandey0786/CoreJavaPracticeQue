package com.ncs.Exception;

public class Finally {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
			double d = a / b;

		} finally {
			System.out.println("executed");
		}
	}

}
