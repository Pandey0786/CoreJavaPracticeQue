package com.ncs.InputOutput;

import java.io.*;

// Here In this Program We will Write Characters In a File
public class WritingCharactersInAFile {

	public static void main(String[] args) throws Exception {

		FileWriter f = new FileWriter("D:\\TestngIO\\Shashank.txt");

		char[] c = { 's', 'h', 'e', 'k', 'h', 'a', 'r' };

		f.write("Pandey ");
		f.write(c);
		f.close();
		System.out.println("Check in The destination Drive For the Results");
	}
}
