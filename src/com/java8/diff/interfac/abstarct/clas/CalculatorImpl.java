package com.java8.diff.interfac.abstarct.clas;

public class CalculatorImpl implements Calculator {

	public int add(int a, int b) {
		
		return a+b;
	}
    public static void main(String[] args)
    {
    	CalculatorImpl cal = new CalculatorImpl();
    	
    	int rst1 = cal.add(3, 4);
    	int rst2 = cal.sub(3, 2);
    	int rst3 = Calculator.multiply(2, 3);
    	
    	System.out.println("add :"+rst1+"sub:"+rst2+"mul:"+rst3);
    	
    }
}
