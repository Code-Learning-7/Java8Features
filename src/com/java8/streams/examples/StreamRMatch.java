package com.java8.streams.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StreamRMatch {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, 20000, "Aumantha"));
		list.add(new Employee(2, 70000, "honny"));
		list.add(new Employee(3, 26000, "oshi"));
		list.add(new Employee(4, 30000, "atrina"));

		Predicate<Employee> p = e -> e.getId() < 5 && e.getName().startsWith("A");
		 Predicate<Employee> p2= ee ->ee.getSalary()<=20000;

		boolean all = list.stream().allMatch(p);
		System.out.println(all);

		boolean any = list.stream().anyMatch(p);
		System.out.println(any);

		boolean none = list.stream().noneMatch(p);
		System.out.println(none);

		boolean match = list.stream().anyMatch(p2);
		System.out.println(match);
	}

}
