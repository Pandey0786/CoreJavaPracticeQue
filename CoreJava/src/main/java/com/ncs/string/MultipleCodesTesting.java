package com.ncs.string;

public class MultipleCodesTesting {

	public static void main(String[] args) {

		/*
		 * String name = "vijay dinanath chouhan"; String[] str = name.split(" "); for
		 * (String s : str) for (int i = s.length() - 1; i >= 0; i--) {
		 * System.out.print(s.charAt(i));
		 * 
		 * }
		 * 
		 * System.out.println(" ALAG ALAG");
		 */

	
		
		String name1 = "vijay dinanath chouhan";
		for (int i = name1.length() - 1; i >= 0; i--) {
			System.out.print(name1.charAt(i));

		}

	}

}
