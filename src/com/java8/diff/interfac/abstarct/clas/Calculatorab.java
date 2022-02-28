package com.java8.diff.interfac.abstarct.clas;

public abstract class Calculatorab {

	public Calculatorab() {
		super();
	}

	public abstract int add(int a, int b);
	
	public int sub(int a, int b)
	{
		return a-b;	
	}
	
    public static int multiply(int a , int b)
    {
		return a*b; 	
    }
	
}
