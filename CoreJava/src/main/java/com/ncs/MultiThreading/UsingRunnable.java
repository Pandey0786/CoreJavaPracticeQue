package com.ncs.MultiThreading;

// Here In this class We are Creating Thread Using RunnableInterface

public class UsingRunnable implements Runnable {

	@Override
	public void run() {

		// In this Method We Write Task For Thread

		for (int i = 0; i <= 5; i++) {

			System.out.println(i);

			/*
			 * try {
			 * 
			 * Thread.sleep(1000); // It will show results in milliseconds } catch
			 * (Exception e) {
			 * 
			 * }
			 */
		}
	}

	public static void main(String[] args) {

		UsingRunnable u = new UsingRunnable();

		Thread t = new Thread(u);

		t.start();
	}
}
