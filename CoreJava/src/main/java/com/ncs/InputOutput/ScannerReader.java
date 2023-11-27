package com.ncs.InputOutput;

import java.io.*;
import java.util.Scanner;

// Program to read a line form Input Stream using ScannerClass
public class ScannerReader {

	public static void main(String[] args) throws Exception {

		FileReader reader = new FileReader("D:\\TestngIO\\Shashank.txt");
		Scanner sc = new Scanner(reader);

		while (sc.hasNext()) {
			String line = sc.nextLine();
			System.out.println(line);
		}
		reader.close();
	}

}
