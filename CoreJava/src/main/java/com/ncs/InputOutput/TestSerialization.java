package com.ncs.InputOutput;

import java.io.*;

public class TestSerialization {

	public static void main(String[] args) throws Exception {

		FileOutputStream file = new FileOutputStream("D:\\TestngIO\\Shashank.txt");

		ObjectOutputStream out = new ObjectOutputStream(file);

		Marksheet m = new Marksheet();

		m.setName("Shyam");
		m.setMath(90);

		out.writeObject(m);

		System.out.println(m.getName());
		System.out.println(m.getMath());
		file.close();
		out.close();
		System.out.println("Task completed");
	}

}
