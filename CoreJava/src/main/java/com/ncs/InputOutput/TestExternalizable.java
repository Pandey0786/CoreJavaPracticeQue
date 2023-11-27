package com.ncs.InputOutput;

import java.io.*;

public class TestExternalizable {

	public static void main(String[] args) throws Exception {

		FileOutputStream f = new FileOutputStream("D:\\TestngIO\\a.txt");
		ObjectOutputStream o = new ObjectOutputStream(f);

		ExtBean m = new ExtBean();

		m.setMath(87);
		m.setTemp(120);

		o.writeObject(m);
		f.close();
		o.close();

		System.out.println(m.getMath());
		System.out.println(m.getTemp());

	}

}
