package com.ncs.Collection.StreamApi;

import java.util.Comparator;
import java.util.*;

public class TestSecondHighestSalary {

	public static void main(String[] args) {

		List<Employee> l = new ArrayList<>();

		l.add(new Employee("A", 30000));
		l.add(new Employee("B", 60000));
		l.add(new Employee("C", 36000));

		double d = l.stream().map(e -> e.salary).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.orElse(0.0);
		System.out.println(d);

	}
}
