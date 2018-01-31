package edu.yccc.cis174.mmuratake.GettingStarted;

import java.util.ArrayList;
import java.util.List;

/**
 * @author smamimuratake
 * January 29 2018
 * Assignment #1: Getting Started
 * 
 * Assign attributes to the object User using getters and setters.
 * 
 */


public class CreateUsers {
	
	// Create list of users.
	List<User> users = new ArrayList<User>();
	
	public void main (String[] args)
	{
		// Create three users.
		
		User u = new User();
		u.setUserName("Stanford");
		u.setUserAge(13);
		u.setUserGender("Male");
		
		User u2 = new User();
		u2.setUserName("Misty");
		u2.setUserAge(17);
		u2.setUserGender("Female");
		
		User u3 = new User();
		u3.setUserName("Cam");
		u3.setUserAge(15);
		u3.setUserGender("Gender Fluid");
		
		System.out.println("User #1");
		System.out.println(u.getUserName() + ", " + u.getUserAge() + " years old; " + u.getUserGender());
		System.out.println("User #2");
		System.out.println(u2.getUserName() + ", " + u2.getUserAge() + " years old; " + u2.getUserGender());
		System.out.println("User #3");
		System.out.println(u3.getUserName() + ", " + u3.getUserAge() + " years old; " + u3.getUserGender());
		
		// Add users to the list (and take one out).
		users.add(u);
		users.add(u2);
		users.add(u3);
		users.remove(u2);
		
		System.out.println(users);
	}
		

}
