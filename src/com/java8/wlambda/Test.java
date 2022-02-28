package com.java8.wlambda;

public class Test {

	public static void main(String[] args) {
		
        StringLength str =(name) -> {
			
			//System.out.println("Name:"+name);
			
			//int len = name.length();
			
			//System.out.println("Length:"+len);
        	
        	System.out.println("Length:"+name.length());
			
			return name.length();
			
		};
		
		str.getLength("Andhrapradesh");

	}

}
