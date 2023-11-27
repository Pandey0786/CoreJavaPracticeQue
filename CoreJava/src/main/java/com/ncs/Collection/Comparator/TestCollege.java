package com.ncs.Collection.Comparator;

import java.util.*;

public class TestCollege {

	public static void main(String[] args) {

		List<College> college = new ArrayList<>();

		college.add(new College("Shashank", 1000));
		college.add(new College("Shekhar", 200));
		college.add(new College("Pandey", 90));
		
		System.out.println(college + "\n");
		
		OrderByCollegeName  o = new OrderByCollegeName();
		
		Collections.sort(college, o);
		System.out.println(college + "\n");
		
		OrderByCollegeNo o1 = new OrderByCollegeNo();
		
		Collections.sort(college, o1);
		System.out.println(college + "\n");
		
	}

}
