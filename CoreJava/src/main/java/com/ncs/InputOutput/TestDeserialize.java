package com.ncs.InputOutput;

import java.io.*;

public class TestDeserialize {

	public static void main(String[] args) throws Exception {

		FileInputStream f = new FileInputStream("D:\\TestngIO\\Shashank.txt");
		ObjectInputStream o = new ObjectInputStream(f);

		Marksheet m = (Marksheet) o.readObject();

		System.out.println("Name : " + m.getName());
		System.out.println("Maths : " + m.getMath());

		f.close();
		o.close();

		System.out.println("Task completed");
	}

}
