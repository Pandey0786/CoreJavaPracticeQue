package com.ncs.Collection.Lambda;

public class TestAdd {

	public static void main(String[] args) {

		Add a1 = (int a, int b) -> {

			return a + b;
		};

		System.out.println(a1.sum(2, 3));

		// Below Code By Following Both Rules For Using Lambda

		Add a2 = (a, b) -> a + b;

		System.out.println(a2.sum(5, 9));
	}
}
