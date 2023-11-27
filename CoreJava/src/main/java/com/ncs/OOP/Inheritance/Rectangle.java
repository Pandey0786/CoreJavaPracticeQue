package com.ncs.OOP.Inheritance;

// Here MEthod Overriding Concept us Also Used
public class Rectangle extends Shape {

	private int length;
	private int breadth;

	public Rectangle() {

	}

	public Rectangle(int i, int j) {

		this.breadth = i;
		this.length = j;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	@Override
	public double area() {

		double area = length * breadth;

		System.out.println("Rectangle Area = "+ area);
		return area;
	}

}
