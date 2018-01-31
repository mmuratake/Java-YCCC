package edu.yccc.cis174.mmuratake.GettingStarted;

import java.util.ArrayList;
import java.util.List;

/**
 * @author smamimuratake
 * January 29 2018
 * Assignment #1: Getting Started
 * 
 * Assign attributes to the object User.
 * Also create a list with some of the users in it.
 * 
 */


public class CreateUsers {
	
	// Create list of users.
	List<User> users = new ArrayList<User>();
	
	public void messWithUserList()
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
		
		System.out.println("User A");
		System.out.println(u.getUserName() + ", " + u.getUserAge() + " years old; " + u.getUserGender());
		System.out.println("User B");
		System.out.println(u2.getUserName() + ", " + u2.getUserAge() + " years old; " + u2.getUserGender());
		System.out.println("User C");
		System.out.println(u3.getUserName() + ", " + u3.getUserAge() + " years old; " + u3.getUserGender());
		
		// Add users to the list (and take one out).
		users.add(u);
		users.add(u2);
		users.add(u3);
		users.remove(u2);
		
		
		// A for loop with the list of users.
		for(int x = 0; x < users.size(); x++)
		{
			int userNumber = x+1;
			System.out.println();
			System.out.println("Hi, I'm User #" + userNumber + " in this user list.");
			System.out.println(users.get(x));
			// Even though you can't tell anything about the attributes of the users, you can tell that there are only two in the list.
		}
				
				
		// If-Else statements about the list of users.
		if(users.contains(u))
		{
			System.out.println("\r\n>There is a male user in this list!");
		}
		else
		{
			System.out.println("\r\n>There is a potential that all users are female.");
		}
		if(!users.contains(u2) && users.contains(u))
		{
			System.out.println(">There is a potential that there are no females in this list!\r\n");
		}
	
	}
	
	public static void main(String[] args)
	{
		CreateUsers c = new CreateUsers();
		c.messWithUserList();
	}

}
