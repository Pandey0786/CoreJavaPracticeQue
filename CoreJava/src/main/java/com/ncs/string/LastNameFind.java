package com.ncs.string;

public class LastNameFind {

	public static void main(String[] args) {
		
		String s = "Shashank Shekhar Pandey";
		
		String a[] = s.split(" ");
		
		String b = a[a.length-1];
		
		System.out.println(b);
	}
	
}
