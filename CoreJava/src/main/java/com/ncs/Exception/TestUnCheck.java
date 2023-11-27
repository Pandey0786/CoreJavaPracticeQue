package com.ncs.Exception;

public class TestUnCheck {

	public static void main(String[] args) {
		dad();
	}

	public static void dad() {
		try {
			mom();
		} catch (UnCheck e) {
			System.out.println(e.getMessage());
		}

	}

	public static void mom() {
		son();
	}

	public static void son() {
		UnCheck c = new UnCheck();
		throw c;
	}
}
