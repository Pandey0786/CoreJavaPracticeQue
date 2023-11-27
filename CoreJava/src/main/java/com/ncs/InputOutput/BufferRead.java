package com.ncs.InputOutput;

import java.io.*;

//  This Program is for Reading the Data using BufferedReader Class
public class BufferRead {

	public static void main(String[] args) throws Exception {

		FileReader f = new FileReader("D:\\TestngIO\\Shashank.txt");
		BufferedReader br = new BufferedReader(f);

		// read method will read single character
		int ch = br.read();
		System.out.println(ch);

		// readline method will read complete line
		String line = br.readLine();
		while (line != null) {

			System.out.println(line);
			line = br.readLine();
		}

		f.close();
		br.close();
	}
}
