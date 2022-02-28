package com.java8.streams.collectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeSummarizing {

	public static void main(String[] args) {
		
		List<Employee> employeeList = Arrays.asList(new Employee("Sumantha", 23, 20000, 30),
		                                            new Employee("Manasa", 25, 30000, 20),
		                                            new Employee("Priyanka", 24, 25000, 24),
		                                            new Employee("Sushitha", 21, 40000, 29));
		
		 long count=employeeList.stream().collect(Collectors.counting());
		 System.out.println(count);
		 
		int ageSum = employeeList.stream().collect(Collectors.summingInt(Employee :: getAge));
		System.out.println(ageSum);
		
		Optional<Employee> minAge =employeeList.stream().min((e1,e2) ->e1.getAge()>e2.getAge()?1:-1);
		
		minAge.get();
		
		System.out.println(minAge);
		
		Optional<Employee> minimAge =employeeList.stream().collect(Collectors.minBy(Comparator.comparing(Employee :: getAge)));
		
		System.out.println("Employee with minimum age"+(minimAge.isPresent()?minimAge.get():"not applicable"));
		
		Optional<Employee> maxAge = employeeList.stream().max((e1,e2) -> e1.getAge()>e2.getAge()?1:-1);
		
		System.out.println(maxAge.get());
		
		Optional<Employee> maximumAge=employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee :: getAge)));
		System.out.println("Employee with max age"+(maximumAge.isPresent()?maximumAge.get():"not applicable"));
		
		Double average =employeeList.stream().collect(Collectors.averagingInt(Employee :: getAge));
		System.out.println(average);
		
		IntSummaryStatistics summarize = employeeList.stream().collect(Collectors.summarizingInt(Employee :: getAge));
		
		System.out.println("Information of Age "+summarize);

	}

}
