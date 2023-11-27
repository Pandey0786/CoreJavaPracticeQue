package com.ncs.Exception;

public class ArrayIndexOutOfBond {

	public static void main(String[] args) {

		int[] a = new int[5];

		// System.out.println(a[9]);

		try {

			System.out.println(a[10]);

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println(e.getMessage());
		}

		char[] ch = { 'a', 'b', 'c' };

		try {

			System.out.println(ch[6]);

		} catch (ArrayIndexOutOfBoundsException e1) {

			// e.getMessage();
			// e.printStackTrace();
			System.out.println(e1.getMessage());
		}

	}
}
