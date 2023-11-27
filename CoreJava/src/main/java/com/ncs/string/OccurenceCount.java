package com.ncs.string;

public class OccurenceCount {

	public static void main(String[] args) {

		String s1 = "Mukul Pandey";
		int count = 0;
	//	String s = s1.toLowerCase();

		for (char a = 'a'; a <= 'z'; a++) {

			for (int i = 0; i < s1.length(); i++) {

				if (s1.charAt(i) == a) {

					count++;
				}
			}
			if (count != 0) {

				System.out.println(a + " = " + count);
				count = 0;

			}

		}

	}

}
