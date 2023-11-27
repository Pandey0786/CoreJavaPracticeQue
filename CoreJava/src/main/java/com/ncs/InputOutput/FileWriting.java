package com.ncs.InputOutput;

import java.io.*;

// Program for Write Characters in a text file 
public class FileWriting {

	public static void main(String[] args) throws Exception {

		FileWriter w = new FileWriter("D:\\TestngIO\\Shashank.txt");

		char[] c = { 'H', 'a', 'b', 'b', 'i', 'b', 'i' };

		w.write(c);
		w.write(',');
		w.write("Welcome ");
		w.write(", To ");
		w.close();
	}
}
