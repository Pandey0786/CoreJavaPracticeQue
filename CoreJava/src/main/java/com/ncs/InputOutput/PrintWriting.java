package com.ncs.InputOutput;

import java.io.*;

// Program for writing in a text file using PrintWriter
public class PrintWriting {

	public static void main(String[] args) throws Exception {

		FileWriter w = new FileWriter("D:\\TestngIO\\Shashank.txt");
		PrintWriter pw = new PrintWriter(w);

		for (int i = 0; i < 5; i++) {

			pw.println(" Kya Haal Haa");
		}

		pw.close();
		w.close();

		System.out.println(" Check Your file in the desired folder");
	}
}
