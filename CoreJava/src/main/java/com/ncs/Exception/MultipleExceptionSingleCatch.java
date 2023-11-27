package com.ncs.Exception;

public class MultipleExceptionSingleCatch {

	public static void main(String[] args) {

		String s = null;
		String a = "Shashank";
		try {
			System.out.println(s.length());
			System.out.println(a.charAt(10));
		} catch (StringIndexOutOfBoundsException | NullPointerException e) {

			System.out.println(e.getMessage());
		}

	}

}
