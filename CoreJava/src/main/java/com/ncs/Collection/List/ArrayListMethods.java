package com.ncs.Collection.List;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {

		ArrayList li = new ArrayList();
		li.add(10);
		li.add(20);
		System.out.println(li);

		System.out.println("addAllmethodExample");

		ArrayList li2 = new ArrayList();
		li2.add(30);
		li2.add(40);
		li2.addAll(li);
		System.out.println(li2);

		 li2.clear();

		//li.removeAll(li);
		System.out.println(li2);
		System.out.println(li.size());
	}
}
