package com.ncs.OOP.Polymorphism;

import com.ncs.OOP.Inheritance.Circle;
import com.ncs.OOP.Inheritance.Rectangle;
import com.ncs.OOP.Inheritance.Shape;

public class MethodReturn {

	public static void main(String[] args) {

		Shape[] s = new Shape[2];

		s[0] = new Circle(5);
		s[1] = new Rectangle(5, 6);

		double arr = calArea(s);

		System.out.println("Total Area =" + arr);

	}

	public static double calArea(Shape[] s) {

		double arr = 0;

		for (int i = 0; i < s.length; i++) {

			arr = arr + s[i].area();

		}

		System.out.println("Circle Area = " + s[0].area());
		System.out.println("Rectangle Area = " + s[1].area());
		return arr;
	}

}
