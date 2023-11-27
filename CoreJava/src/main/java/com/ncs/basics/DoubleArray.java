package com.ncs.basics;

public class DoubleArray {

	public static void main(String[] args) {

		double[] a = { 10.60, 11.99, 22.8, 11.69 };

		int[] b;
		int[] c;

		b = new int[a.length];
		c = new int[a.length];

		double s = 0;
		double x = 0;

		int r = 0;
		int d = 0;

		for (int i = 0; i < a.length; i++) {

			int z = (int) (a[i] * 100);

			r = z % 100;

			b[i] = r;

			d = z / 100;

			c[i] = d;

			s = s + b[i];

			x = x + c[i];

			System.out.println("Integer Value = " + c[i]);

			System.out.println("Point Value = " + b[i]);
		}

		System.out.println("Integer Total = " + x);

		System.out.println("Decimal Total = " + s);

		System.out.println("Integer Average = " + x / a.length);

		System.out.println("Decimal Average = " + s / a.length);

	}

}
