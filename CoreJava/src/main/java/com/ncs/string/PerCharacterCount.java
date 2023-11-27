package com.ncs.string;

public class PerCharacterCount {

	public static void main(String[] args) {

		String a[] = { "Shashank", "Pandey", "mukul", "Shekhar" };

		int count = 0;

		for (int k = 0; k < a.length; k++) {

			for (char C = 'a'; C <= 'z'; C++) {

				for (int i = 0; i < a[k].length(); i++) {

					if (a[k].charAt(i) == C) {

						count++;

					}

				}
				if (count != 0) {

					System.out.println(a [k] + " occur " + C+"=" + "  " + count);
					count=0;
				}
			}
		}

	}

}
