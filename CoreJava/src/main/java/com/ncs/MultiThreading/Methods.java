package com.ncs.MultiThreading;

public class Methods {

	public static void main(String[] args) {

		// sleep
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		int a = 2 + 2;
		System.out.println(a);

		Thread t = Thread.currentThread();

		// getName
		String s = t.getName();
		System.out.println("Current Thread is = " + s);

		// setName
		t.setName("GOJO SATORU");
		System.out.println("Current Thread is = " + t.getName());

		// getId
		System.out.println("Current Thread Id = " + t.getId());

	}

}
