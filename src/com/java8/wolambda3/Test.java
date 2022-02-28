package com.java8.wolambda3;

public class Test {

	public static void main(String[] args) {
		
		MyRunnable mr = new MyRunnable();
		
		Thread t = new Thread(mr);
		
		t.start();
		
		for(int i=0 ; i<10 ; i++)
		{
			System.out.println("Main Thread-"+i);
		}
	}

}
