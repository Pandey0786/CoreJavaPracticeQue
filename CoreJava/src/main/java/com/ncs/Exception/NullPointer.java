package com.ncs.Exception;

public class NullPointer {

	public static void main(String[] args) {

		String s = null;

		// System.out.println(s.length());
		try {
			System.out.println(s.length());

		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
}
