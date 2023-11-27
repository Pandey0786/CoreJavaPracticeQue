package com.ncs.Collection.Comparable;

import java.util.*;

public class TestEmployee {

	public static void main(String[] args) {

		List<Employee> employee = new ArrayList<>();

		employee.add(new Employee("shashank", 2));
		employee.add(new Employee("xavier", 1));
		employee.add(new Employee("pandey", 1));

		System.out.println(employee);

		Collections.sort(employee);

		System.out.println(employee);
	}

}
