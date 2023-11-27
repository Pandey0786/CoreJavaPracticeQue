package com.ncs.OOP.This;

// Here this keyword is use to call the current class instance variable

public class This1 {

	int i;

	public void setI(int i) {
		this.i = i;
	}

	public void Show() {

		System.out.println(i);
	}

	public static void main(String[] args) {

		This1 th1 = new This1();

		th1.setI(90);
		th1.Show();
	}
}
