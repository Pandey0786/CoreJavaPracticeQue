package com.ncs.string;

public class IntegerExtraction {

	public static void main(String[] args) {

		String[] s = { "Sha1shank", "She5khar", "Pan7dey" };

		int count = 0;

		for (int i = 0; i < s.length; i++) {

			for (int j = 0; j < s[i].length(); j++) {

				if (Character.isDigit(s[i].charAt(j))) {

		count = count + Integer.parseInt(String.valueOf(s[i].charAt(j)));
				}
			}
		}
		System.out.println(count);
	}
}
