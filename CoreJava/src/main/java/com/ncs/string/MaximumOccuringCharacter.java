package com.ncs.string;

public class MaximumOccuringCharacter {

	public static void main(String[] args) {

		String s = "Shashank Shekhar Pandey";

		s = s.replaceAll("\\s", ""); // for removing Space

		int[] a = new int[127];

		for (int i = 0; i < s.length(); i++) {

			a[s.charAt(i)] = a[s.charAt(i)] + 1;
		}

		int m = -1;
		char c = ' ';

		for (int i = 0; i < s.length(); i++) {

			if (m < a[s.charAt(i)]) {

				m = a[s.charAt(i)];

				c = s.charAt(i);
			}
		}

		System.out.println("Maximum Repeated Character " + c + " is " + m);

	}

}
