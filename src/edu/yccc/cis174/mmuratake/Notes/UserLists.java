package edu.yccc.cis174.mmuratake.Notes;

import java.util.ArrayList;
import java.util.List;

public class UserLists {
	
	public List<Users> loadUsers()
	{
		// Create a list of User objects.
		
		// Be CAREFUL with list names!! It's very difficult...
		
		// The thing inside List<*here*> is named after the Class of what you want to put in there. The Class with the getters and setters.
		// I think.
		List<Users> users = new ArrayList<Users>();
		
		Users samuel = new Users("Samuel", "Enphusom", "ILikePeople");
		Users yata = new Users("Misaki", "Yata", "Derya");
		
		users.add(samuel);
		users.add(yata);
		
		return users;
	}
	
	public static void main(String[] args)
	{
		// Create an instance of this class.
		UserLists us = new UserLists();
		List<Users> myUsers = us.loadUsers();
		
		for(Users user2 : myUsers)
		{
			System.out.println(user2);
			// System.out.println(user2.getFirstName() + " " + user2.getLastName());
			
			// You don't need the above code anymore because you assigned it in toString! Neat!
		}
	}

}
