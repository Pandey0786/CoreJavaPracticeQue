package com.ncs.Collection.Lambda;

/*   start or khatam  jo ha vo apni anonymous class ka Range Ha 
 
 yaha par interface ka obj nahi ban rha ha anonymous class jo ha vo 
 interface ki implementation ke taur pe use ho rahi ha or 
 uske andar jo method override hui ha vo anonymous class 
 me parent class se child class me method ka 
 override hua ha to ek baat clear rakhna 
 interface Lamda class ka Obj nahi bana ha 
 child class me method ko override kiya gaya HA
 
  * For Not Making Extra Class Mainly This Anonymous Class Concept We Use from Java 8 
  * Extra Class Means Jo Oth Point me Concept Use Hua Ha
*/

public class TestLambda {

	public static void main(String[] args) {

		// Oth Point From Notes Basic Class Implementation

		Lamda L0 = new LambdaImplementation();

		L0.goodEvening();

		// 1st Point From Notes Using Anonymous Function
		// What is Going Below Explanation IS Above

		Lamda L1 = new Lamda() { // start ha

			@Override
			public void goodEvening() {

				System.out.println(
						"This IS Anonymous Class Working Example " + "Second Way for Using Functional Interface");
			}
		}; // khatam ha

		L1.goodEvening();

		// Second Implementation Using Anonymous Class

		Lamda L1two = new Lamda() {

			@Override
			public void goodEvening() {

				System.out.println("This is second Example for Anonymous Class ");

			}
		};

		L1two.goodEvening();

		// 2nd Point From Notes Using Our Interface By Using Lambda
		// And Also Following the Rules For the Lambda

		Lamda l = () -> {

			System.out.println("This IS the Working Using Lambda Expression");
		};

		l.goodEvening();

		Lamda l2 = () -> System.out.println("Second Implementation Of Lambda");

		l2.goodEvening();

	}

}
