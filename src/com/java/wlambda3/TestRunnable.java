package com.java.wlambda3;

public class TestRunnable {

	public static void main(String[] args) throws InterruptedException {
		
		Runnable mr =	() -> {
			
			for(int i=0 ; i<10 ; i++)
			{
				System.out.println("Child Thread-"+i);
			}

		};

		Thread t = new Thread(mr);
		
		t.start();
		t.sleep(10);
		
		for(int i=0;i<10;i++)
		{
			System.out.println("MainThread-"+i);
		}
		
		

	}

}
