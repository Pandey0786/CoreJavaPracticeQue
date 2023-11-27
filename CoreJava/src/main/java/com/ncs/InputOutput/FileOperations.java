package com.ncs.InputOutput;

import java.io.File;

// In this Program we will reads file from a Directory and Create an new Folder in the Desired Folder
public class FileOperations {

	public static void main(String[] args) {

		File f = new File("D:\\TestngIO");

		String[] s = f.list();

		for (String s1 : s) {

			System.out.println(s1);
		}

		// Now Creating A new Folder in the Directory Desired Folder

	//	File f1 = new File(f, "Ss");

	//	System.out.println(f1.mkdir()); // It will Create an Folder in the Directory

		// f1.delete();

	}
}
