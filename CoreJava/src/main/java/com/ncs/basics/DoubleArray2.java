package com.ncs.basics;

public class DoubleArray2 {

	public static void main(String[] args) {

		double[] a = { 10.68, 11.99, 22.8, 11.69 };

		int[] b = new int[a.length];
		int[] c = new int[a.length];

		int d = 0;
		int e = 0;

		for (int i = 0; i < a.length; i++) {

			String[] arr = String.valueOf(a[i]).split("[.]");

			b[i] = Integer.parseInt(arr[0]);
			c[i] = Integer.parseInt(arr[1]);

			System.out.println("Integer Value = " + b[i]);
			System.out.println("Decimal Value = " + c[i]);

			d = d + b[i];

			e = e + c[i];

		}

		System.out.println("Total Integer Sum = " + d);
		System.out.println("Total Decimal sum = " + e);

	}

}
