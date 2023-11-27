package com.ncs.Collection.StreamApi;

import java.util.*;

public class OddNoFind {

	public static void main(String[] args) {

		List<Integer> n = Arrays.asList(1, 4, 8, 40, 11, 22, 33, 99);

		n.stream().filter(e -> e % 2 != 0).forEach(System.out::println);

	}
}
