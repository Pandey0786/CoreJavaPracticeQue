package com.ncs.basics;

public class AnnonymousTest {

	public static void main(String[] args) {

		AnnonymousFunction a = new AnnonymousFunction() {

			@Override
			public void say() {

				System.out.println("IT IS WORKING");

			}
		};
		a.say();
	}

}
