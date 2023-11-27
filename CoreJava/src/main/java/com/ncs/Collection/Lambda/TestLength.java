package com.ncs.Collection.Lambda;

public class TestLength {

	public static void main(String[] args) {

		Length l = s -> s.length();

		System.out.println(l.getLength("Shashank Pandey"));

	}

}
