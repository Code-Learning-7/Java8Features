package com.java8.collections.wolambda;

import java.util.Collections;
import java.util.Comparator;

public class MyComparator implements Comparator<Integer> { // inbuilt functional interface : Comparator

	@Override
	public int compare(Integer arg0, Integer arg1) {
		
	/*	if(arg0 < arg1)	
		{
			return -1; // before
		}
		else if(arg0 > arg1)
		{
		return 1; //after
		}
		else
		{
			return 0;
		} */
		
		return (arg0 < arg1)? 1 : (arg0 > arg1) ? -1 : 0; // ternary operator
	}
	

}

