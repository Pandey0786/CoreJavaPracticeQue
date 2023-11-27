package com.ncs.Collection.Generic;

/*
 * In this class I have done an example program of generic
 * and created an test class of it in the below code p is 
 * mentioned as type safe in the diamond or we can say that
 * in the generic type define in the test class multiple time
 * by creating the object of this class different data type 
 * values I have given according the type safe case 
 * 
 * Because if we create an common object there is an possibility 
 * that in huge applications it will slow our application 
 * and also not type safe so at run time confusion will occur
 */

public class Onepiece<P> {

	P luffy;

	public Onepiece(P luffy) {

		this.luffy = luffy;
	}

	public Object getValue() {

		return this.luffy;
	}

	public void CheckIntegerOrString() {

		if (luffy instanceof String) {

			System.out.println("Length of String is = " + luffy + " " + ((String) this.luffy).length() + "\n");

		} else if (luffy instanceof Integer) {

			System.out.println("Here it is Integer Value = " + luffy + "\n");

		}
	}

}
