package com.ncs.basics;

public class DigitCount {
	
	public static void main(String[] args) {
		
		int a = 232777;
		
		int c = 0;
		
		while(a!=0) {
			
			c++;
			a=a/10;
			
		}
		System.out.println(c);
	}

}
