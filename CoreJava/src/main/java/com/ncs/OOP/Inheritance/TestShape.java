package com.ncs.OOP.Inheritance;

public class TestShape {

	public static void main(String[] args) {
		double area = 0.0;

		Shape[] s = new Shape[3];
		s[0] = new Circle();
		s[1] = new Rectangle();
		s[2] = new Triangle();

		Circle c = (Circle) s[0];
		c.setRadius(5);

		Rectangle r = (Rectangle) s[1];
		r.setLength(6);
		r.setBreadth(6);

		Triangle m = (Triangle) s[2];
		m.setBase(5);
		m.setHeight(5);

		for (int i = 0; i < s.length; i++) {

			area = area + s[i].area();
		}

		System.out.println("Total Area = " + area);

	}

}
