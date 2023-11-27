package com.ncs.Exception;

public class MultipleCatchBlock {

	public static void main(String[] args) {

		String a = null;
		String b = "Shashank";
		int z = 50;
		int x = 0;

		try {

			int w = z / x;

			System.out.println(a.length());
			System.out.println(b.charAt(20));
			System.out.println(w);

		} catch (NullPointerException e) {
			System.out.println("Null Pointer Exception");

		} catch (StringIndexOutOfBoundsException e1) {
			System.out.println("String Index Out Of Bond Exception");

		} catch (ArithmeticException e2) {
			System.out.println("Arithmetic Exception ");

		} finally {
			System.out.println("Finally Block Will always Execute");
		}
	}
}
