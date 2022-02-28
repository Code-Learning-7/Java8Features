package com.ava8.collections.mapwolambda;

import java.util.Map;
import java.util.TreeMap;

public class SortingMap2 {

	public static void main(String[] args) {
		
		Map<String, String> map = new TreeMap<>(new MyComparator2());
		
		map.put("AU", "Australia");
		map.put("US", "USA");
		map.put("IN", "India");
		map.put("CN", "Canada");
		
		System.out.println("Map values:"+map);

	}

}
