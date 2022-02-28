package com.java8.stringjoiner;

import java.util.StringJoiner;

public class JoinerPreSuf {

	public static void main(String[] args) {
		
		StringJoiner sj = new StringJoiner(",","[","]");//delimiter , prefix , suffix
		
		sj.add("Telugu");
		sj.add("Tamil");
		sj.add("Hindi");
		
		System.out.println(sj);

	}

}
