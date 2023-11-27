package com.ncs.InputOutput;

import java.io.*;

// Program for read data from keyboard and write into a text file 
public class ReadFromKeyboard {

	public static void main(String[] args) throws Exception {

		PrintWriter pw = new PrintWriter(new FileWriter("D:\\TestngIO\\Shashank.txt"));
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String line = br.readLine();

		while (!line.equals("quit")) {
			pw.println(line);
			line = br.readLine();
		}
		
		br.close();
		pw.close();
		is.close();
		
		System.out.println(" Check your file");

	}
}
