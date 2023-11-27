package com.ncs.OOP.Inheritance;

//Here MEthod Overriding Concept us Also Used
public class Circle extends Shape {

	private int radius;

	public Circle() {

	}

	public Circle(int i) {

		this.radius = i;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double area() {

		double area = 3.14 * radius * radius;
		System.out.println("Circle Area =" + area);
		return area;
	}

}
