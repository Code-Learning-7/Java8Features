package com.java8.collections.mapwlambda;

import java.util.Map;
import java.util.TreeMap;

public class SortingMap2 {

	public static void main(String[] args) {
		
		Map<String, String> map = new TreeMap<>(
				
				(s1,s2) -> s2.compareTo(s1)
				
				);
		
		map.put("AU", "Australia");
		map.put("IN", "INDIA");
		map.put("CN", "Canada");
		map.put("NM", "Namibia");
		
		System.out.println("MAP :"+map);
		

	}

}
