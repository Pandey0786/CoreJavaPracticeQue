package com.ncs.InputOutput;

import java.io.*;

// Program to read and write binary data means Image type files 
public class BinaryReadWrite {

	public static void main(String[] args) throws Exception {

		FileInputStream file = new FileInputStream("D:\\a.jpg");
		FileOutputStream out = new FileOutputStream("D:\\TestngIO\\b.jpg");

		int ch = file.read();

		while (ch != -1) {

			out.write(ch);
			ch = file.read();
		}

		out.close();
		file.close();
	}
}
