package com.java8.methodreference;

public class FnInterfaceImpl implements FnInterface1 {

	public static void main(String[] args) {
		
		FnInterfaceImpl fn = new FnInterfaceImpl();
		
		FnInterface1 out =fn::m2; //method referencing
		
		out.m1();

	}

	public void m2()
	{
		System.out.println("This is method2");
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

}
