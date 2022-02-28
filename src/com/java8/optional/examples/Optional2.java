package com.java8.optional.examples;

import java.util.Optional;

public class Optional2 {

	public static void main(String[] args) {
		
		String[] str = new String[10];
		str[5]="SUMANTHA";
		Optional<String> op = Optional.ofNullable(str[5]);
		System.out.println(op);
		if(op.isPresent())
		{
		    String a =str[5].toLowerCase();
		    System.out.println(a);
	    }
		else
		{
			System.out.println("Value not present");
		}

}
}