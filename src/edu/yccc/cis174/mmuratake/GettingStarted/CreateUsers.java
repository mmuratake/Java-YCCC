package edu.yccc.cis174.mmuratake.GettingStarted;

public class CreateUsers {
	
	public static void main (String[] args)
	{
		User u = new User();
		u.setUserName("Jedidiah");
		u.setUserAge("15");
		u.setUserGender("Male");
		
		User u2 = new User();
		u2.setUserName("Misty");
		u2.setUserAge("17");
		u2.setUserGender("Female");
		
		User u3 = new User();
		u3.setUserName("Cam");
		u3.setUserAge("15");
		u3.setUserGender("Fluid");
	}

}
