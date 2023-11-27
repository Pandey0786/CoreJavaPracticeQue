package com.ncs.Collection.Map;

import java.util.*;

public class HashMap0 {

	public static void main(String[] args) {

		java.util.HashMap map = new java.util.HashMap();

		map.put(null, "Zero");
		map.put("0", null);
		map.put("1", "One");
		map.put("2", "Two");
		map.put("3", "Three");

		String val = (String) map.get("1");

		map.remove("1");

		Set Keys = map.keySet();
		for (Object k : Keys) {
			System.out.println(k);
		}

		Collection vals = map.values();
		for (Object v : vals) {
			System.out.println(v);
		}

		Set KeyValue = map.entrySet();
		for (Object ele : KeyValue) {
			Map.Entry pair = (Map.Entry) ele;
			System.out.println(pair.getKey() + "-" + pair.getValue());

		}
	}
}
