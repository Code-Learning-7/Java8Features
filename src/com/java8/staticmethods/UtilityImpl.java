package com.java8.staticmethods;

public class UtilityImpl implements Utility {

	@Override
	public int square(int a) {
		
		return a*a;
	}

	public static void main(String[] args) {
		
		UtilityImpl ut = new UtilityImpl();
		ut.square(3);
		Utility.show();

	}

}

//Static , default - allowed in Interfaces from java8.

