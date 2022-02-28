package com.java8.optional.examples;


import java.util.Optional;

public class OptionalEx3 {

	public static void main(String[] args) {
		
		String[] str = new String[10];
		//str[5]="SUMANTHA";
		Optional<String> op = Optional.ofNullable(str[5]);
		System.out.println(op.hashCode());
		if(op.hashCode()!= 0)
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