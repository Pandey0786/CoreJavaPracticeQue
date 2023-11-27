package com.ncs.Exception;

public class ExitFinally {

	public static void main(String[] args) {

		String a = null;

		try {

			System.out.println(a.length());

		} catch (NullPointerException e) {

			System.out.println(e.getMessage());
			System.exit(0);

		} finally {

			System.out.println("Finally Block Not Calling Here");
		}
	}

}
