package com.ncs.InputOutput;

import java.io.*;

public class FileMerge {

	public static void main(String[] args) throws Exception {

		PrintWriter pw = new PrintWriter("D:\\TestngIO\\d.txt");

		BufferedReader br = new BufferedReader(new FileReader("D:\\TestngIO\\w1.txt"));
		String line = br.readLine();

		while (line != null) {
			pw.println(line);
			line = br.readLine();
		}
		br = new BufferedReader(new FileReader("D:\\TestngIO\\w3.txt"));
		line = br.readLine();

		while (line != null) {
			pw.println(line);
			line = br.readLine();
		}
		pw.flush();

		br.close();
		pw.close();
		System.out.println("Check your folder");
	}

}
