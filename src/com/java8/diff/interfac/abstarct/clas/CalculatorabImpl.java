package com.java8.diff.interfac.abstarct.clas;

public class CalculatorabImpl extends Calculatorab {

	public int add(int a, int b) {
		
		return a+b;
	}

	public static void main(String[] args) {
		
		CalculatorabImpl cal = new CalculatorabImpl();
		int rst1 = cal.add(2, 3);
		int rst2 = cal.sub(3, 2);
		//int rst3 = Calculatorab.multiply(2, 3); // can call by parent class name
		//int rst3 = CalculatorabImpl.multiply(2, 3); // can call by child class name
		int rst3 = cal.multiply(2, 3); // can call by object of a child class
		
		System.out.println("add:"+rst1+"sub:"+rst2+"mul:"+rst3);

	}

}
