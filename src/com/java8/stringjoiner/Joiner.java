package com.java8.stringjoiner;

import java.util.StringJoiner;

public class Joiner {

	public static void main(String[] args) {
		
		StringJoiner sjoin = new StringJoiner(",");
		
		sjoin.add("Chaitrali");
		sjoin.add("Vaidhya");
		sjoin.add("Sana");
		
		System.out.println(sjoin);

       StringJoiner sjoins = new StringJoiner(":");
		
		sjoins.add("Sumantha");
		sjoins.add("B.E");
		sjoins.add("SoftwareEngineer");
		
		System.out.println(sjoins);
	}

}
