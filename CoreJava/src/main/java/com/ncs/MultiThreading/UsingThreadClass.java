package com.ncs.MultiThreading;

// Here We Are creating an Thread Using Thread Class

public class UsingThreadClass extends Thread {

	public void run() {

		System.out.println("By Using Thread Class");
		/*
		 * for (int i = 0; i < 5; i++) {
		 * 
		 * System.out.println(i);
		 * 
		 * 
		 * try { 
		 * 
		 * Thread.sleep(1000); } catch (Exception e) {
		 * 
		 * }
		 * 
		 * }
		 */
	}

	public static void main(String[] args) {

		UsingThreadClass u = new UsingThreadClass();

		u.start(); // Directly Calling Through Class Object Because We Have Extends The Thread
					// Class
	}
}
