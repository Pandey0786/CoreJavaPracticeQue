package com.ncs.MultiThreading;

public class Daemon extends Thread {

	public void run() {
		System.out.println("Run method started" + " " + Thread.currentThread().isDaemon());
		while (true) {
			try {
				Thread.sleep(200);
				System.out.println("Deamon thread wokeup");
			} catch (Exception e) {

			}
		}
	}

	public static void main(String[] args) {
		System.out.println("main started");
		Daemon d = new Daemon();
		d.setDaemon(true);
		d.start();
		try {
			Thread.sleep(600);
			System.out.println("Inside main method");

		} catch (Exception e) {

		}
		System.out.println("leaving main thread");
		System.out.println("now jvm will exit");

	}
}
