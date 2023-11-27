package com.ncs.OOP.Encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		String s = "03-06-2023";
		
		Date d = sdf.parse(s);
		
		Person p= new Person();
		p.setName("Shashank");
		p.setAddress("Ballia");
		p.setDob(d);
		
		System.out.println(p.getName());
		System.out.println(p.getAddress());
		System.out.println(p.getDob());
		System.out.println(Person.getAge());
	}

}
