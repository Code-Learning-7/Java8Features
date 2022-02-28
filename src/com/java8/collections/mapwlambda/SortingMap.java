package com.java8.collections.mapwlambda;

import java.util.Map;
import java.util.TreeMap;

public class SortingMap {

	public static void main(String[] args) {
		
		Map<Integer, String> map= new TreeMap<>((o1,o2) -> 
		      {
			    return (o1<o2)? 1 : (o1>o2) ? -1 : 0;
			  });
		
		map.put(4, "India");
		map.put(1, "Australia");
		map.put(3, "Namibia");
		map.put(2, "England");
		
		System.out.println("Map Values:"+map);

	}

}
