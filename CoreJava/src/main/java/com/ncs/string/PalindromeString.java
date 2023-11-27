package com.ncs.string;

public class PalindromeString {
	
	public static void main(String[] args) {
		
		String s = "MADAM";
		String r = "";
		
		for(int i = s.length()-1; i>=0; i--) {
			
			r = r + s.charAt(i);
		}
          System.out.println(r);	
          
          if(s.equalsIgnoreCase(r)) {
        	  
        	  System.out.println("Palindrome String");
        	  
          }else {
        	  
        	  System.out.println("NOT a Palindrome String");
          }
	}

}
