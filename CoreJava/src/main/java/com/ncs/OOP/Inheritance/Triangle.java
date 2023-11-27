package com.ncs.OOP.Inheritance;

//Here MEthod Overriding Concept us Also Used
public class Triangle extends Shape {

	private int base;
	private int height;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public double area() {

		double area = base * height;
		System.out.println("Triangle Area = " + area);
		return area;
	}

}
