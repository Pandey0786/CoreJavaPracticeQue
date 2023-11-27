package com.ncs.basics;

public class ReverseDigits {
	
	public static void main(String[] args) {
		
		int n = 1235353;
		int s = 0;
		int a;
		
		while(n != 0) {
			
			a = n%10;
			
			s = s*10+a;
			
			n = n/10;
			
		}
		
		System.out.println(s);
	}

}
