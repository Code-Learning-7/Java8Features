package com.java8.methodreference;

public class FnInterface3Impl implements FnInterface3 {

	public FnInterface3Impl() {
		super();
		System.out.println("This is a constructor"); // constructor concept
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args)
	{
		//FnInterface3Impl fn = new FnInterface3Impl();
		 FnInterface3 out=FnInterface3Impl::new;
		   
		 out.m1();		
		
	}
}
