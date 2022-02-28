package com.java8.stringjoiner;

import java.util.StringJoiner;

public class Joiner3 {

	public static void main(String[] args) {
		
		StringJoiner sj = new StringJoiner(";");
		
		sj.add("Nellore");
		sj.add("Chennai");
		sj.add("Hyderabad");
		
		StringJoiner sj1 = new StringJoiner(",");
		
		sj1.add("Mumbai");
		sj1.add("karnata");
		
		StringJoiner sj3 =sj1.merge(sj);
		
		System.out.println(sj3);

	}

}
