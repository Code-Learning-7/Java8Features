package com.java8.predicate.fn.interfac;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx6 {

	public static void main(String[] args) {
		
		List<User> userList = new ArrayList<>();
		
		User user1 = new User("Sumantha", "admin");
		User user2 = new User("sravanthi" , "user");
		User user3 = new User("Rupa", "user");
		
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		
		Predicate<User> predicate = u -> u.getRole().equals("user");
		
		List<User> rstList = new ArrayList<>();
		
		for (User user : userList) {	
		     if(predicate.test(user))
		     {
		         rstList.add(user);
		     }
		}
		System.out.println(rstList);
	}
}
