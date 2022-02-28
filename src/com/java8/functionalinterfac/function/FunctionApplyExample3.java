package com.java8.functionalinterfac.function;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Function;

public class FunctionApplyExample3 {
	
	public static void main(String[] args)
	{
	
	List<Employee> employees = new ArrayList<>();
	
	employees.add(new Employee(1, "Rose", 15));
	employees.add(new Employee(2, "Jasmine", 13));
	employees.add(new Employee(3, "Lilly", 20));
	
	System.out.println("EmployeeList:"+employees);
	
Function<List<Employee>, Map<Integer, Employee>> listToMap= emp -> {
		  
		Map<Integer, Employee> map = new HashMap<>();
		
		for (Employee employ : employees) {
			
			map.put(employ.getId(), employ);
		}
		
		return map;		
	};
	
	Map<Integer, Employee> empMap=listToMap.apply(employees);
	
	System.out.println("Map is:"+empMap);
	
//	 Set<Entry<Integer, Employee>> LtoM= empMap.entrySet();
//	   for (Entry<Integer, Employee> entry : LtoM) {
//		   System.out.println(entry.getKey()+":"+entry.getValue());
//	   }
	for (Entry<Integer, Employee> entry : empMap.entrySet()) {
		System.out.println(entry.getKey()+":"+entry.getValue());
	}
}

	
}