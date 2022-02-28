package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeWStream {

	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList<>();
		
		employeeList.add(new Employee(1, "Sumantha", 20, 20000, "India"));
		employeeList.add(new Employee(2, "Priyanka", 22, 30000, "India"));
		employeeList.add(new Employee(3, "Manasa", 22, 50000, "USA"));
		employeeList.add(new Employee(4, "Sushitha", 27, 40000, "UK"));
		
		Map<String, List<Employee>> list = employeeList.stream().collect(Collectors.groupingBy(p -> p.getCountrty(),Collectors.toList()));
		
		System.out.println(list);

	}

}
