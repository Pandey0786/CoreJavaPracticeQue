package com.ncs.string;


public final class Immutable {
  
	  private final int ID;
	  
	  private final String NAME;
	  
	  public int getID() {
		  return ID;
		  
	  }
	  public String getName() {
		  return NAME;
		  
	  }
	 
	  
	  public Immutable(int i,String s) {
		  
		  ID=i;
		  NAME=s;
	  }
	  public static void main(String[] args) {
		Immutable s = new Immutable(5, "rams");
				System.out.println(s.getID());
				System.out.println(s.getName());
	}
}

