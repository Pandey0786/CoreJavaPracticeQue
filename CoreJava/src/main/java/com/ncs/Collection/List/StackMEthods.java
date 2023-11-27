package com.ncs.Collection.List;

import java.util.Stack;

public class StackMEthods {

	public static void main(String[] args) {

		Stack s = new Stack();

		s.push("Shashank");
		s.push("Pandey");
		s.push(24);

		System.out.println(s);
		System.out.println(s.peek());
		// System.out.println(s.pop());
		System.out.println(s.search("Shashank"));
		System.out.println(s.empty());

	}
}
