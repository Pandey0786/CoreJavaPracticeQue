package com.ncs.Collection.Queue;

import java.util.*;

public class UsingArrayDeque {

	public static void main(String[] args) {

		Queue<Integer> q = new ArrayDeque<>(); // Here It will work as an double ended queue

		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);

		while (!q.isEmpty()) {

			System.out.println(q.peek());
			q.remove();
		}

	}

}
