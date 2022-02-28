package com.java8.methodreference;

public class FnInterface2Impl implements FnInterface2 {

	public static void main(String[] args) {
		
           FnInterface2 fn =FnInterface2Impl::m2;
           
           fn.m1();
                 
	}

	@Override
	public void m1() {
		
		System.out.println("Example");
		
	}
    
	public static void m2()
	{
		System.out.println("This is method refrencing Example2");
	}
}
